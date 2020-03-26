package main.java.com.xian.designpattern.singleton;
/**饿汉式
 * 优点：最简单、最安全、最经典、线程安全（类加载的时候就实例化了一个对象，JVM保证了线程安全）
 * 缺点：不被调用的时候会造成内存浪费，比如当这种单例模式的类大量出现（成千上万）或者暂时不用、用的频率不高
*        不适用于框架的容器，比如Spring IOC，因为IOC容器不知道你会配置多少单例对象，也不知道这些配置的对象
 *        会不会用的到。
* * */
public class HungrySingleton {
    //构造方法私有化
    private HungrySingleton(){}

    //随着类的加载而被实例化
    public static final HungrySingleton INSTANCE=new HungrySingleton();

    //提供一个全局访问点
    public static final HungrySingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println(h1==h2);
    }

}
