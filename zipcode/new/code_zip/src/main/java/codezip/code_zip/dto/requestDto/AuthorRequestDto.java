package codezip.code_zip.dto.requestDto;

public class AuthorRequestDto {
    private String name;
    private Long zipcodeId;

    public AuthorRequestDto() {
    }

    public AuthorRequestDto(String name, Long zipcodeId) {
        this.name = name;
        this.zipcodeId = zipcodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getZipcodeId() {
        return zipcodeId;
    }

    public void setZipcodeId(Long zipcodeId) {
        this.zipcodeId = zipcodeId;
    }
}
