package dps_03_action_type.dp11_visitor.example2.visitor;

import dps_03_action_type.dp11_visitor.example2.concrete_element.Man;
import dps_03_action_type.dp11_visitor.example2.concrete_element.Woman;

/**
 * �����߽�ɫ��Visitor����Ϊ�ö���ṹ�о���Ԫ�ؽ�ɫ����һ�����ʲ����ӿڡ�<br>
 * �ò����ӿڵ����ֺͲ�����ʶ�˷��ͷ����������������ߵľ���Ԫ�ؽ�ɫ��<br>
 * ���������߾Ϳ���ͨ����Ԫ�ؽ�ɫ���ض��ӿ�ֱ�ӷ�������<br>
 * ״̬������<br>
 * @author Administrator
 */
public interface Action {

  /**
   * �õ����˽��ۻ�Ӧ<br>
   * @param concreteElementA
   */
  public void getManConclusion(Man concreteElementA);

  /**
   * �õ�Ů�˽��ۻ�Ӧ<br>
   * @param concreteElementB
   */
  public void getWomanConclusion(Woman concreteElementB);

}
