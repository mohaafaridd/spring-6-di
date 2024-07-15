package mohaafaridd.dev.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello everyone from base service";
    }
}
