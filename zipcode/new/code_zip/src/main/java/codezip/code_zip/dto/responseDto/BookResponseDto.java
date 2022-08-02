package codezip.code_zip.dto.responseDto;

import java.util.List;


public class BookResponseDto {
    private Long id;
    private String name;
    private List<String> authorNames;
    private String categoryName;

    public BookResponseDto() {
    }

    public BookResponseDto(Long id, String name, List<String> authorNames, String categoryName) {
        this.id = id;
        this.name = name;
        this.authorNames = authorNames;
        this.categoryName = categoryName;
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

    public List<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(List<String> authorNames) {
        this.authorNames = authorNames;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
