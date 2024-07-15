package mohaafaridd.dev.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String greet() {
        return "Hey i'm setting a greeting";
    }
}
