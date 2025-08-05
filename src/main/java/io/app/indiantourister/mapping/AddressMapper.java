package io.app.indiantourister.mapping;

import io.app.indiantourister.dto.AddressDto;
import io.app.indiantourister.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AddressMapper {

//    @Mapping(target = "street1", source = "street1")
    AddressDto toAddressDto(Address address);

    @Mapping(target="id", ignore = true)
    @Mapping(target="customer", ignore = true)
    Address toEntity(AddressDto dto);
}
