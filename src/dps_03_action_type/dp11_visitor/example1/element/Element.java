package dps_03_action_type.dp11_visitor.example1.element;

import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * Ԫ�ؽ�ɫ��Element��������һ��Accept����������һ��������Ϊ������<br>
 * @author Administrator
 */
public interface Element {

  /**
   * ����һ��������<br>
   * @param visitor
   */
  public void accept(Visitor visitor);

}
