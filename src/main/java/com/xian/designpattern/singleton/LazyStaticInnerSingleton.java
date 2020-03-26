package main.java.com.xian.designpattern.singleton;
/*静态内部类懒汉式：巧妙的利用了Java的语法
        类加载顺序,加载外部类时不会加载内部类，实现了懒加载
        JVM保证了线程安全，单例。
*
* */
public class LazyStaticInnerSingleton {

    private LazyStaticInnerSingleton(){}

    public static LazyStaticInnerSingleton getInstance(){
        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static LazyStaticInnerSingleton instance = new LazyStaticInnerSingleton();
    }
}
