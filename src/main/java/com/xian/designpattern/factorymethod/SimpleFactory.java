package main.java.com.xian.designpattern.factorymethod;
//简单工厂：
//扩展性不高，如果增加新的交通工具，需要在工厂类中添加相应代码，违背了闭包原则。
public class SimpleFactory {

    public Car creatCar(){
        return new Car();
    }

    public Bus creatBus(){
        return new Bus();
    }
}
