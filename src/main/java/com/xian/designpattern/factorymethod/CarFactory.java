package main.java.com.xian.designpattern.factorymethod;

public class CarFactory {

    public Transportation creat(){
        return new Car();
    }
}
