package dps_03_action_type.dp11_visitor.example2.concrete_visitor;

import dps_03_action_type.dp11_visitor.example2.concrete_element.Man;
import dps_03_action_type.dp11_visitor.example2.concrete_element.Woman;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * ��������߽�ɫ��Concrete Visitor����ʵ��ÿ���ɷ����߽�ɫ��Visitor�������Ĳ�����<br>
 * ���ʱ<br>
 * @author Administrator
 */
public class Marriage implements Action {

  /**
   * �õ����˽��ۻ�Ӧ<br>
   * @param concreteElementA
   */
  public void getManConclusion(Man concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + " "
        + getClass().getSimpleName() + "ʱ���п�����������Ϸ�ս�ʱ��������ͽ�̡�ң���ڡ�");
  }

  /**
   * �õ�Ů�˽��ۻ�Ӧ<br>
   * @param concreteElementB
   */
  public void getWomanConclusion(Woman concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + " "
        + getClass().getSimpleName() + "ʱ����οԻ�����鳤��·�������������ձ�ƽ����");
  }

}
