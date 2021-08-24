package one.digitalinnovation.personapi.Mapper;

import one.digitalinnovation.personapi.DTO.Request.PersonDTO;
import one.digitalinnovation.personapi.Entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy") //dateFormat ignored
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}