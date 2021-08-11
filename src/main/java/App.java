import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
       System.out.println(bean.getMessage());

        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        boolean comparisonHello = bean == secondBean;
        System.out.println(comparisonHello);

        Cat bean1 = (Cat) applicationContext.getBean("cat");
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        boolean comparisonCat = bean1==bean2;
        System.out.println(comparisonCat);
    }
}