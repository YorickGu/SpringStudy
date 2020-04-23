package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 05:24
 * @description：
 * @modified By：
 * @version: $
 */
@Component()
public class MessagePrinter {
    public MessagePrinter() {
        System.out.println("messageprinter.......");
    }

    @Autowired
    private MessageService messageService;
    @Autowired(required = false)
    private MessageSender messageSender;


    public void printMessage() {
        System.out.println("Test!!");
        String ss = messageService.getMessage();
        System.out.println(ss);
        if (messageSender != null) {

            String s = messageSender.send();
            System.out.println(s);
        }
    }
}
