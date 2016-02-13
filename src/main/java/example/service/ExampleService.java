package example.service;

import example.repository.PersonDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final PersonDaoImpl personDao;

    @Autowired
    public ExampleService(PersonDaoImpl personDao) {
        this.personDao = personDao;
    }

    public String getMessage(int id) {
        return personDao.getPerson(id) + "is cool";
    }
}
