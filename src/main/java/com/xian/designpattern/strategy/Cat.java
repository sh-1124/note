package main.java.com.xian.designpattern.strategy;

public class Cat implements Comparable<Cat>{
    private int height;
    private int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" + "height=" + height + ", weight=" + weight + '}';
    }

    //实现了Comparable接口，定义了猫的比较方法，但是只能够按照compareTo()方法中定义的猫的身高来排序，不够灵活。
    @Override
    public int compareTo(Cat c) {
        if(this.height<c.height) return -1;
        else if(this.height>c.height) return 1;
        else return 0;
    }
}
