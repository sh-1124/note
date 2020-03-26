package main.java.com.xian.designpattern.singleton;

/*普通的懒汉式:采用延迟加载的方式，当要用到对象时，才去创建，
               但是线程不安全，改进的措施是加锁，锁只需要加在需要同步的位置上，这样可以提高效率
               没有必要加在整个方法上。锁只需要锁住new的过程。
* */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance ;//注意这里不能加final，因为final修饰的在类加载的时候必须实例化。

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if (instance==null)
            instance=new LazySimpleSingleton();
        return instance;
    }
}
