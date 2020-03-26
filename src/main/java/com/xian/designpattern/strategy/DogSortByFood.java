package main.java.com.xian.designpattern.strategy;

//按照狗的饭量进行比较
public class DogSortByFood implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getFood()>o2.getFood()) return -1;
        else if(o1.getFood()<o2.getFood()) return 1;
        else return 0;
    }
}
