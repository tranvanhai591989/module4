package cart.service;

import cart.model.Cart;
import cart.model.Item;
import cart.model.exception.CartNotFoundException;
import cart.model.exception.ItemIsAlreadyAssignedException;
import cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ItemService itemService;

    @Autowired
    public CartService(CartRepository cartRepository, ItemService itemService) {
        this.cartRepository = cartRepository;
        this.itemService = itemService;
    }

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getCarts() {
        return StreamSupport
                .stream(cartRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Cart getCart(Integer id) {
        return cartRepository.findById(id).orElseThrow(() ->
                new CartNotFoundException(id));
    }

    public Cart deleteCart(Integer id) {
        Cart cart = getCart(id);
        cartRepository.delete(cart);
        return cart;
    }

    @Transactional
    public Cart editCart(Integer id, Cart cart) {
        Cart cartToEdit = getCart(id);
        cartToEdit.setName(cart.getName());
        return cartToEdit;
    }

    @Transactional
    public Cart addItemToCart(Integer cartId, Integer itemId) {
        Cart cart = getCart(cartId);
        Item item = itemService.getItem(itemId);
        if (Objects.nonNull(item.getCart())) {
            throw new ItemIsAlreadyAssignedException(itemId,item.getCart().getId());
        }
        cart.addItem(item);
        item.setCart(cart);
        return cart;
    }

    @Transactional
    public Cart removeItemFromCart(Integer cartId, Integer itemId) {
        Cart cart = getCart(cartId);
        Item item = itemService.getItem(itemId);
        cart.removeItem(item);
        return cart;
    }
}