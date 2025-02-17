package mohaafaridd.dev.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String greet() {
        return "Hello I'm the primary service";
    }
}
