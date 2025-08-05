package io.app.indiantourister.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ContactDto {
    private Long id;
    private String email;
    private Long mobile;
}
