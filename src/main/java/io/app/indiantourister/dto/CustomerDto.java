package io.app.indiantourister.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Set;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<AddressDto> addressDto;
    private Set<ContactDto> contactDto;
}
