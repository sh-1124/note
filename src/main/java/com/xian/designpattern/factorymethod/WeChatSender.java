package main.java.com.xian.designpattern.factorymethod;

public class WeChatSender implements Sender{
    @Override
    public void send() {
        System.out.println("通过微信发送消息");
    }
}
