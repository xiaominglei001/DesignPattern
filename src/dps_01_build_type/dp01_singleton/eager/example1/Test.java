package dps_01_build_type.dp01_singleton.eager.example1;

import dps_01_build_type.dp01_singleton.eager.example1.EagerSingleton;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //饿汉式单例:
    EagerSingleton instance1 = EagerSingleton.getInstance();
    EagerSingleton instance2 = EagerSingleton.getInstance();

    //从输出结果可以看出两次创建的实例是同一对象
    System.out.println("饿汉式单例:");
    System.out.println(instance1);
    System.out.println(instance2);
  }

}
