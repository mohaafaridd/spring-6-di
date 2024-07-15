package mohaafaridd.dev.spring6di.controllers;

import mohaafaridd.dev.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.greet();
    }
}
