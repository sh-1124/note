package main.java.com.xian.designpattern.singleton;
/*枚举懒汉式：通过枚举实现单例模式
        同一枚举类型中名称相同的对象一定是同一个，在内存中只有一份，枚举类型没有构造方法，这样就阻止了序列化反序列化的破坏
        不能通过反射来构造枚举类型的实例，这样就防止了反射的破坏
* */
public enum EnumSingleton {
    INSTANCE;
    public static EnumSingleton getInstance(){ return INSTANCE;}
}
