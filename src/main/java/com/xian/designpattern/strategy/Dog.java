package main.java.com.xian.designpattern.strategy;

public class Dog {
    private int age;
    private int food;//饭量
    private int intelligence;//智力

    public Dog(int age, int food, int intelligence) {
        this.age = age;
        this.food = food;
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", food=" + food +
                ", intelligence=" + intelligence +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getFood() {
        return food;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
