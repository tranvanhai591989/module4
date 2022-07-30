package cart.controller;

import cart.model.Cart;
import cart.model.dto.CartDto;
import cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public ResponseEntity<CartDto> addCart(@RequestBody final CartDto cartDto) {
        Cart cart = cartService.addCart(Cart.from(cartDto));
        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CartDto>> getCarts() {
        List<Cart> carts = cartService.getCarts();
        List<CartDto> cartsDto = carts.stream().map(CartDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(cartsDto, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<CartDto> getCart(@PathVariable final Integer id) {
        Cart cart = cartService.getCart(id);
        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<CartDto> deleteCart(@PathVariable final Integer id) {
        Cart cart = cartService.deleteCart(id);
        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<CartDto> editCart(@PathVariable final Integer id,
                                            @RequestBody final CartDto cartDto) {
        Cart cart = cartService.editCart(id, Cart.from(cartDto));
        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
    }

    @PostMapping(value = "{cartId}/items/{itemId}/add")
    public ResponseEntity<CartDto> addItemToCart(@PathVariable final Integer cartId,
                                                 @PathVariable final Integer itemId) {
        Cart cart = cartService.addItemToCart(cartId, itemId);
        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
    }

    @DeleteMapping(value = "{cartId}/items/{itemId}/remove")
    public ResponseEntity<CartDto> removeItemFromCart(@PathVariable final Integer cartId,
                                                      @PathVariable final Long itemId) {
        Cart cart = cartService.removeItemFromCart(cartId, itemId);
        return new ResponseEntity<>(CartDto.from(cart), HttpStatus.OK);
    }
}