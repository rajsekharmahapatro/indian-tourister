package io.app.indiantourister.mapping;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, ContactMapper.class})
public interface CustomerMapper {
    @Mapping(source = "addressDto", target = "address")
    @Mapping(source = "contactDto", target = "contact")
    public Customer mapToUserEntity(CustomerDto user);

//    @Mapping(source = "address", target = "addressDto")
//    @Mapping(source = "contact", target = "contactDto")
    public CustomerDto mapToUserDto(Customer customer);
}
