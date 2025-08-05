package io.app.indiantourister.mapping;

import io.app.indiantourister.dto.ContactDto;
import io.app.indiantourister.model.Contact;
import org.mapstruct.Mapper;

@Mapper
public interface ContactMapper {
    ContactDto toContactDto(Contact contact);
    Contact toEntity(ContactDto dto);
}
