package mohaafaridd.dev.spring6di.controllers;

import mohaafaridd.dev.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.greet();
    }
}
