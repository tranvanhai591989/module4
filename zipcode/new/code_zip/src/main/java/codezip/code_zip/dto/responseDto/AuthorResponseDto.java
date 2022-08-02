package codezip.code_zip.dto.responseDto;

import lombok.Data;

import java.util.List;

public class AuthorResponseDto {
    private Long id;
    private String name;
    private List<String> bookNames;
    private String zipcodeName;

    public AuthorResponseDto() {
    }

    public AuthorResponseDto(Long id, String name, List<String> bookNames, String zipcodeName) {
        this.id = id;
        this.name = name;
        this.bookNames = bookNames;
        this.zipcodeName = zipcodeName;
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

    public String getZipcodeName() {
        return zipcodeName;
    }

    public void setZipcodeName(String zipcodeName) {
        this.zipcodeName = zipcodeName;
    }
}
