package cart.model.exception;

import java.text.MessageFormat;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(final Integer id){
        super(MessageFormat.format("Could not find item with id: {0}", id));
    }
}