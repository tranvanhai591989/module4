package codezip.code_zip.dto.requestDto;

public class CityRequestDto {
    private String name;

    public CityRequestDto() {
    }

    public CityRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
