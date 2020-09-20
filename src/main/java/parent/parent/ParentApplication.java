package parent.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentApplication {

    public static void main(String[] args) {
        System.out.println("Hello World from the parent project");
        SpringApplication.run(ParentApplication.class, args);
    }

}
