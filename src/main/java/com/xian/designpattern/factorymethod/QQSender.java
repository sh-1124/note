package main.java.com.xian.designpattern.factorymethod;

public class QQSender implements Sender {
    @Override
    public void send() {
        System.out.println("通过QQ发送消息");
    }
}
