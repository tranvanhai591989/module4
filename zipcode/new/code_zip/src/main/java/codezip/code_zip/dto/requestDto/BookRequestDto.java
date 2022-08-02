package codezip.code_zip.dto.requestDto;


import java.util.List;


public class BookRequestDto {
    private String name;
    private List<Long> authorIds;
    private Long categoryId;

    public BookRequestDto() {
    }

    public BookRequestDto(String name, List<Long> authorIds, Long categoryId) {
        this.name = name;
        this.authorIds = authorIds;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getAuthorIds() {
        return authorIds;
    }

    public void setAuthorIds(List<Long> authorIds) {
        this.authorIds = authorIds;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
