package example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepository {

    public String getMessage() {
        return "George is cool";
    }

}
