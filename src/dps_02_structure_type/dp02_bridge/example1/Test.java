package dps_02_structure_type.dp02_bridge.example1;

import dps_02_structure_type.dp02_bridge.example1.abstraction.Abstraction;
import dps_02_structure_type.dp02_bridge.example1.concrete_implementor.ConcreteImplementorA;
import dps_02_structure_type.dp02_bridge.example1.concrete_implementor.ConcreteImplementorB;
import dps_02_structure_type.dp02_bridge.example1.refined_abstraction.RefinedAbstraction;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //���󻯽�ɫ(Abstraction)�����󻯽ӿڶ���
    Abstraction a = new RefinedAbstraction();

    //����ʵ�ֻ���ɫ(Concrete Implementor)��ʵ�ֻ���ɫ�ӿڵľ���ʵ��
    a.setImplementor(new ConcreteImplementorA());
    a.operation();//ִ�о������

    a.setImplementor(new ConcreteImplementorB());
    a.operation();//ִ�о������
  }

}
