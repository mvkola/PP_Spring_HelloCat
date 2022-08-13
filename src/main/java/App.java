import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld firstBeanHello =
                (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld secondBeanHello =
                (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println("For a pair of helloWorld beans the statement is: "
                + (firstBeanHello == secondBeanHello));

        Cat firstBeanCat =
                (Cat) applicationContext.getBean("cat");
        Cat secondBeanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println("For a pair of cat beans the statement is: "
                + (firstBeanCat == secondBeanCat));

        System.out.println("helloWorld bean message: " + firstBeanHello.getMessage());
        System.out.println("cat bean message: " + firstBeanCat.getMessage());
    }
}
