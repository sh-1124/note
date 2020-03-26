package main.java.com.xian.designpattern.singleton;
/*双重检查懒汉式：只对需要线程同步的代码块进行加锁
        优点：延迟实例化避免了内存的浪费、通过加锁保证了线程安全、只锁住同步的代码提高了性能
        缺点：造成代码阅读困难，不够优雅
* */
public class LazyDoubleCheckSingleton {

    public static volatile LazyDoubleCheckSingleton instance;//volatile关键字是由于同步代码块中涉及到了指令重排序

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //第一次检查要不要加锁
        if(instance==null){
            synchronized(LazyDoubleCheckSingleton.class){
                //第二次检查要不要new
                if(instance==null) {
                    return instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
