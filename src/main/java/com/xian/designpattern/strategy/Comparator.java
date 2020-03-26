package main.java.com.xian.designpattern.strategy;

//定义一个比较器，任何实现了该接口的类，都具有比较功能。
public interface Comparator<T> {
    int compare(T o1,T o2);
}
