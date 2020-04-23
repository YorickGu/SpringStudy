package hello;

import org.springframework.stereotype.Component;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 10:47
 * @description：
 * @modified By：
 * @version: $
 */
//@Component
public class MessageSender {
    public MessageSender() {
    }

    public String send() {
        return "send a message";
    }
}
