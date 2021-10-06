import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean helloWorld = firstBean == secondBean;
        System.out.println("Сравнение бинов HelloWorld по ссылке = " + helloWorld);
        Cat firstCat = (Cat) applicationContext.getBean("cat");
        Cat secondCat = (Cat) applicationContext.getBean("cat");
        boolean cat = firstCat == secondCat;
        System.out.println("Сравнение бинов Cat по ссылке = " + cat);
    }
}