package hello;

import org.springframework.stereotype.Component;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 05:20
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class MessageService {

    public MessageService() {
        System.out.println("meaasgeservice.......");
    }

    /**
     * @Description: 执行打印的功能
     * @Param:
     * @return: 返回要打印的字符串
     */
    public String getMessage() {
        return "Hello World!";
    }
}
