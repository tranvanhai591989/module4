package management.card.dto;

import java.util.HashMap;
import java.util.Map;

public class CardDto {
    private Map<ProductDto, Integer> productMap = new HashMap<>();

    public CardDto() {
    }

    public CardDto(Map<ProductDto, Integer> productMap) {
        this.productMap = productMap;
    }

    public Map<ProductDto, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<ProductDto, Integer> productMap) {
        this.productMap = productMap;
    }

    public void addProduct(ProductDto productDto) {
        if (productMap.containsKey(productDto)) {
            Integer currentValue = productMap.get(productDto);
            productMap.replace(productDto, currentValue + 1);
        }else {
            productMap.put(productDto,1);
        }
    }
}
