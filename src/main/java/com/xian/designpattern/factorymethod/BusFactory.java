package main.java.com.xian.designpattern.factorymethod;

public class BusFactory {

    public Transportation creat(){
        return new Bus();
    }
}
