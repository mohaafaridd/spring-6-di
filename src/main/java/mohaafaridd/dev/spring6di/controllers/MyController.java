package mohaafaridd.dev.spring6di.controllers;

import mohaafaridd.dev.spring6di.services.GreetingService;
import mohaafaridd.dev.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.greet();
    }
}
