package codezip.code_zip.dto.responseDto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryResponseDto {
    private Long id;
    private String name;
    private List<String> bookNames;

    public CategoryResponseDto() {
    }

    public CategoryResponseDto(Long id, String name, List<String> bookNames) {
        this.id = id;
        this.name = name;
        this.bookNames = bookNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBookNames() {
        return bookNames;
    }

    public void setBookNames(List<String> bookNames) {
        this.bookNames = bookNames;
    }
}
