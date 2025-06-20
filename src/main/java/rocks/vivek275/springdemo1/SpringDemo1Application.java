package rocks.vivek275.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemo1Application {
    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
    @GetMapping("/azure")
    public String azure() {
        return "Hello This App is Currently Deployed on Azure!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringDemo1Application.class, args);
    }

}
