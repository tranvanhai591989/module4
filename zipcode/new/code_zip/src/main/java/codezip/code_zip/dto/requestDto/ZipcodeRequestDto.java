package codezip.code_zip.dto.requestDto;


public class ZipcodeRequestDto {
    private String name;
    private Long cityId;

    public ZipcodeRequestDto() {
    }

    public ZipcodeRequestDto(String name, Long cityId) {
        this.name = name;
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}
