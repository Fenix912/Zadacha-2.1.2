import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //Создание Spring контейнера
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //Получение объекта из Spring контейнера
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        //через sout выводим имя объекта.
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("Cat");
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        // Сравниваем 2 пары бинов по ссылке
        System.out.println(bean == bean2);
        System.out.println(cat == cat2);
    }
}