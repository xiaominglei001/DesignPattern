package dps_02_structure_type.dp02_bridge.example2.concrete_implementor;

import dps_02_structure_type.dp02_bridge.example2.implementor.Action;

/**
 * ����ʵ�ֻ���ɫ(Concrete Implementor)��ʵ�ֻ���ɫ�ӿڵľ���ʵ��<br>
 * ��Ϊ:����<br>
 * @author Administrator
 */
public class PutMilk implements Action {

  /**���̵Ķ���*/
  public void execute() {
    System.out.println("����");
  }

}
