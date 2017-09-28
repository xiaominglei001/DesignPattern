package dps_01_build_type.dp01_singleton.eager.example1;

/**
 * 饿汉式单例(唯一角色即类本身):<br>
 * 在类被加载的时候，唯一实例已经被创建。这个设计模式在Java中容易实现，在别的语言中难以实现。<br>
 * @author Administrator
 */
public class EagerSingleton {

  /**私有的(private)唯一(static final)实例成员,在类加载的时候就创建好了单例对象*/
  private static final EagerSingleton instance = new EagerSingleton();

  /**
   * 私有构造函数,避免从外部创建实例
   */
  private EagerSingleton() {
  }

  /**
   * 静态工厂方法,返回此类的唯一实例.<br>
   * @return EagerSingleton      
   */
  public static EagerSingleton getInstance() {
    return instance;
  }

}