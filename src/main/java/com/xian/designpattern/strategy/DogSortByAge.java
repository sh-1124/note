package main.java.com.xian.designpattern.strategy;

//按照狗的年龄进行比较
public class DogSortByAge implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getAge()>o2.getAge()) return -1;
        else if(o1.getAge()<o2.getAge()) return 1;
        else return 0;
    }
}
