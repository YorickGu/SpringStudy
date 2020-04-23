package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 10:19
 * @description：Test
 * @modified By：
 * @version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = appconfig.class)
public class AppTest {

    @Autowired
    private MessagePrinter messagePrinter;

    @Test
    public void Testprinter() {

        //在使用了测试类以后，我们main中的主类application.java其实可以删掉了，因为已经用不到了
        messagePrinter.printMessage();
    }
}
