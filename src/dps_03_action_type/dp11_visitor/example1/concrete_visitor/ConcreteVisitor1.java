package dps_03_action_type.dp11_visitor.example1.concrete_visitor;

import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementA;
import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementB;
import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * ��������߽�ɫ��Concrete Visitor����ʵ��ÿ���ɷ����߽�ɫ��Visitor�������Ĳ�����<br>
 * @author Administrator
 */
public class ConcreteVisitor1 implements Visitor {

  /**
   * ����Ԫ��A<br>
   * @param concreteElementA
   */
  public void visitConcreteElementA(ConcreteElementA concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + "��"
        + getClass().getSimpleName() + "����");
  }

  /**
   * ����Ԫ��B<br>
   * @param concreteElementB
   */
  public void visitConcreteElementB(ConcreteElementB concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + "��"
        + getClass().getSimpleName() + "����");
  }

}
