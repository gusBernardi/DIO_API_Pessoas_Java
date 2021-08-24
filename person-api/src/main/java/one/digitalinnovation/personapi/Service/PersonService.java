package one.digitalinnovation.personapi.Service;

import one.digitalinnovation.personapi.DTO.Request.PersonDTO;
import one.digitalinnovation.personapi.DTO.Response.MessageReponseDTO;
import one.digitalinnovation.personapi.Entity.Person;
import one.digitalinnovation.personapi.Exception.PersonNotFoundException;
import one.digitalinnovation.personapi.Mapper.PersonMapper;
import one.digitalinnovation.personapi.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonMapper personMapper = PersonMapper.INSTANCE;
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageReponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);

        return MessageReponseDTO.builder()
                .message("Created person, ID: " + savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();

        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyId(id);

        return personMapper.toDTO(person);
    }

    public void removeById(Long id) throws PersonNotFoundException {
        verifyId(id);
        personRepository.deleteById(id);
    }

    public MessageReponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyId(id);
        Person personToUpdate = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToUpdate);

        return MessageReponseDTO.builder()
                .message("Updated person, ID: " + savedPerson.getId())
                .build();
    }

    private Person verifyId(Long id) throws PersonNotFoundException {
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }
}