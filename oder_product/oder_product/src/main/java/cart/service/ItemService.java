package cart.service;

import cart.model.Item;
import cart.model.exception.ItemNotFoundException;
import cart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getItems() {
        return StreamSupport
                .stream(itemRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Item getItem(Integer id) {
        return itemRepository.findById(id).orElseThrow(() ->
                new ItemNotFoundException(id));
    }

    public Item deleteItem(Integer id) {
        Item item = getItem(id);
        itemRepository.delete(item);
        return item;
    }

    @Transactional
    public Item editItem(Integer id, Item item) {
        Item itemToEdit = getItem(id);
        itemToEdit.setSerialNumber(item.getSerialNumber());
        return itemToEdit;
    }
}