package cart.model.dto;

import cart.model.Cart;
import lombok.Data;

@Data
public class PlainCartDto {
    private Integer id;
    private String name;

    public static PlainCartDto from(Cart cart){
        PlainCartDto plainCartDto = new PlainCartDto();
        plainCartDto.setId(cart.getId());
        plainCartDto.setName(cart.getName());
        return plainCartDto;
    }
}