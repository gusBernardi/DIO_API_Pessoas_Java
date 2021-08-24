package one.digitalinnovation.personapi.Mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import one.digitalinnovation.personapi.DTO.Request.PersonDTO;
import one.digitalinnovation.personapi.DTO.Request.PersonDTO.PersonDTOBuilder;
import one.digitalinnovation.personapi.Entity.Person;
import one.digitalinnovation.personapi.Entity.Person.PersonBuilder;
import one.digitalinnovation.personapi.Entity.Phone;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-23T18:34:48-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 11.0.11 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        PersonBuilder person = Person.builder();

        person.birthDate( personDTO.getBirthDate() );
        person.id( personDTO.getId() );
        person.firstName( personDTO.getFirstName() );
        person.lastName( personDTO.getLastName() );
        person.cpf( personDTO.getCpf() );
        List<Phone> list = personDTO.getPhones();
        if ( list != null ) {
            person.phones( new ArrayList<Phone>( list ) );
        }

        return person.build();
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTOBuilder personDTO = PersonDTO.builder();

        personDTO.id( person.getId() );
        personDTO.firstName( person.getFirstName() );
        personDTO.lastName( person.getLastName() );
        personDTO.cpf( person.getCpf() );
        personDTO.birthDate( person.getBirthDate() );
        List<Phone> list = person.getPhones();
        if ( list != null ) {
            personDTO.phones( new ArrayList<Phone>( list ) );
        }

        return personDTO.build();
    }
}
