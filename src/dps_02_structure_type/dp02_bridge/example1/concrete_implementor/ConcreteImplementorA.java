package dps_02_structure_type.dp02_bridge.example1.concrete_implementor;

import dps_02_structure_type.dp02_bridge.example1.implementor.Implementor;

/**
 * ����ʵ�ֻ���ɫ(Concrete Implementor)��ʵ�ֻ���ɫ�ӿڵľ���ʵ��<br>
 * @author Administrator
 */
public class ConcreteImplementorA implements Implementor {

  /**
   * ���о������
   */
  public void operation() {
    System.out.println("����ʵ��A�ķ���ִ��.");
  }

}
