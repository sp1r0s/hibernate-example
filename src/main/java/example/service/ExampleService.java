package example.service;

import example.repository.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Autowired
    private PersonDao personDao;

    public String getMessage(int id) {
        return personDao.findById(id).getName() + " is cool!!";
    }
}