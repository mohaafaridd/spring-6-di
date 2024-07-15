package mohaafaridd.dev.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjectedService implements GreetingService {
    @Override
    public String greet() {
        return "I hate property injection";
    }
}
