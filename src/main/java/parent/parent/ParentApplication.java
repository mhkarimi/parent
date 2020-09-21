package parent.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentApplication {

    public static void main(String[] args) {
        System.out.println("Hello World from the parent project");
        System.out.println("After I pushed to the child,I pulled from the parent. Now I want to push only parent changes" +
                "and ignore child changes");
        System.out.println("Test git pull --recurse-submodules from Parent");

        SpringApplication.run(ParentApplication.class, args);
    }

}
