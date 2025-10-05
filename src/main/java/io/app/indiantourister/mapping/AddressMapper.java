package io.app.indiantourister.mapping;

import io.app.indiantourister.dto.AddressDto;
import io.app.indiantourister.model.Address;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)public interface AddressMapper {
    Address toEntity(AddressDto addressDto);

    AddressDto toDto(Address address);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)Address partialUpdate(AddressDto addressDto, @MappingTarget Address address);
}