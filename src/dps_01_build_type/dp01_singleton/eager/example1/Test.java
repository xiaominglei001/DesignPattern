package dps_01_build_type.dp01_singleton.eager.example1;

import dps_01_build_type.dp01_singleton.eager.example1.EagerSingleton;

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
    EagerSingleton instance1 = EagerSingleton.getInstance();
    EagerSingleton instance2 = EagerSingleton.getInstance();

    //�����������Կ������δ�����ʵ����ͬһ����
    System.out.println("����ʽ����:");
    System.out.println(instance1);
    System.out.println(instance2);
  }

}
