package dps_03_action_type.dp11_visitor.example1.visitor;

import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementA;
import dps_03_action_type.dp11_visitor.example1.concrete_element.ConcreteElementB;

/**
 * �����߽�ɫ��Visitor����Ϊ�ö���ṹ�о���Ԫ�ؽ�ɫ����һ�����ʲ����ӿڡ�<br>
 * �ò����ӿڵ����ֺͲ�����ʶ�˷��ͷ����������������ߵľ���Ԫ�ؽ�ɫ��<br>
 * ���������߾Ϳ���ͨ����Ԫ�ؽ�ɫ���ض��ӿ�ֱ�ӷ�������<br>
 * @author Administrator
 */
public interface Visitor {

  /**
   * ����Ԫ��A<br>
   * @param concreteElementA
   */
  public void visitConcreteElementA(ConcreteElementA concreteElementA);

  /**
   * ����Ԫ��B<br>
   * @param concreteElementB
   */
  public void visitConcreteElementB(ConcreteElementB concreteElementB);

}
