package dps_02_structure_type.dp02_bridge.example1.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example1.abstraction.Abstraction;

/**
 * ������󻯽�ɫ(Refined Abstraction)�����󻯾���ʵ��<br>
 * @author Administrator
 */
public class RefinedAbstraction extends Abstraction {

  /**
   * ִ�о������
   */
  public void operation() {
    implementor.operation();
  }

}
