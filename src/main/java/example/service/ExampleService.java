package example.service;

import example.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository repository;

    @Autowired
    public ExampleService(ExampleRepository repository) {
        this.repository = repository;
    }

    public String getMessage() {
        return repository.getMessage() + "!!!!";
    }
}
