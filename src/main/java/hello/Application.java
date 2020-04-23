package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 05:26
 * @description：Main class
 * @modified By：
 * @version: $
 */

public class Application {
    public static void main(String[] args) {
        System.out.println("application");
        //初始化spring 容器
        ApplicationContext context = new AnnotationConfigApplicationContext(appconfig.class);
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

    }
}
