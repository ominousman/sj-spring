package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Properties;

@RestController
public class HelloController {

    //@Resource(name = "myProps")
    //private Properties myProps;

    public String foo;

    @RequestMapping("/")
    public String index() {


        return "Greetings from Spring Boot!";
    }
    
}
