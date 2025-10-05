package io.app.indiantourister.mapping;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.model.Customer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)public interface CustomerMapper {
    Customer toEntity(CustomerDto customerDto);

    CustomerDto toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)Customer partialUpdate(CustomerDto customerDto, @MappingTarget Customer customer);
}