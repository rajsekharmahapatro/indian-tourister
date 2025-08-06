package io.app.indiantourister.mapping;

import io.app.indiantourister.dto.CustomerDto;
import io.app.indiantourister.model.Address;
import io.app.indiantourister.model.Contact;
import io.app.indiantourister.model.Customer;
import org.aspectj.lang.annotation.After;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, ContactMapper.class})
public interface CustomerMapper {
    @Mapping(source = "addressDto", target = "address")
    @Mapping(source = "contactDto", target = "contact")
    public Customer mapToUserEntity(CustomerDto user);

//    @Mapping(source = "address", target = "addressDto")
//    @Mapping(source = "contact", target = "contactDto")
    public CustomerDto mapToUserDto(Customer customer);

    @AfterMapping
    default void setAddressCustomerRelation(@MappingTarget Customer customer){
        if(customer.getAddress()!=null){
            for (Address address : customer.getAddress()) {
                address.setCustomer(customer);
            }
        }
    }

    @AfterMapping
    default  void setContactCustomerRelation(@MappingTarget Customer customer){
        if(customer.getContact() != null){
            for(Contact contact : customer.getContact()){
                contact.setCustomer(customer);
            }
        }
    }
}
