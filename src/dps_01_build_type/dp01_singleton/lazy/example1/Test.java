package dps_01_build_type.dp01_singleton.lazy.example1;

import dps_01_build_type.dp01_singleton.lazy.example1.LazySingleton;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����ʽ����:
    LazySingleton instance1 = LazySingleton.getInstance();
    LazySingleton instance2 = LazySingleton.getInstance();

    //�����������Կ������δ�����ʵ����ͬһ����
    System.out.println("����ʽ����:");
    System.out.println(instance1);
    System.out.println(instance2);
  }

}
