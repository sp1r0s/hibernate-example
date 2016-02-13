package example.controller;

import example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private final ExampleService service;

    @Autowired
    public ExampleController(ExampleService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity getDefaultMessage() {
        return new ResponseEntity<>(service.getMessage(1), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity getMessageForId(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getMessage(id), HttpStatus.OK);
    }
}