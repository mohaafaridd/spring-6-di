package mohaafaridd.dev.spring6di;

import mohaafaridd.dev.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(Spring6diApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("I'm in main method");

        System.out.println(controller.sayHello());
    }

}
