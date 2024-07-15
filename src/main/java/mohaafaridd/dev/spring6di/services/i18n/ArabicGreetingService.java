package mohaafaridd.dev.spring6di.services.i18n;

import mohaafaridd.dev.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("AR")
@Service("i18nService")
public class ArabicGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "مرحبا";
    }
}
