import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;

    }
    @Scope("prototype")
    @Bean(name="Cat")
    public Cat getAge() {
        Cat cat = new Cat();
        cat.setAge("10");
        return cat;
    }
}