package dps_01_build_type.dp01_singleton.lazy.example1;

/**
 * 懒汉式单例(唯一角色即类本身):<br>
 * 在类加载的时候不创建单例实例。<br>
 * 只有在第一次请求实例的时候的时候创建，并且只在第一次创建后，以后不再创建该类的实例。<br>
 * @author Administrator
 */
public class LazySingleton {

  /**私有静态对象,加载时候不做初始化*/
  private static LazySingleton instance;

  /**
   * 私有构造函数,避免从外部创建实例
   */
  private LazySingleton() {
  }

  /**
   * 静态工厂方法,返回此类的唯一实例. 当发现实例没有初始化的时候,才初始化.<br>
   * @return LazySingleton
   */
  public synchronized static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }

}