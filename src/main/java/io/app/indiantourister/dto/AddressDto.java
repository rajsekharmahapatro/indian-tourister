package io.app.indiantourister.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Lombok;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AddressDto {
    private Long id;
    private String street1;
    private String street2;
    private String cityName;
    private String stateName;
}
