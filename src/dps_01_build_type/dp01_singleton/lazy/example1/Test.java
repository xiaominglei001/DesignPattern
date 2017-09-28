package dps_01_build_type.dp01_singleton.lazy.example1;

import dps_01_build_type.dp01_singleton.lazy.example1.LazySingleton;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //懒汉式单例:
    LazySingleton instance1 = LazySingleton.getInstance();
    LazySingleton instance2 = LazySingleton.getInstance();

    //从输出结果可以看出两次创建的实例是同一对象
    System.out.println("懒汉式单例:");
    System.out.println(instance1);
    System.out.println(instance2);
  }

}
