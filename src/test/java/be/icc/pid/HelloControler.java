package be.icc.pid;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloControler {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
