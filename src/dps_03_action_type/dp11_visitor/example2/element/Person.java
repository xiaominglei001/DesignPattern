package dps_03_action_type.dp11_visitor.example2.element;

import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * Ԫ�ؽ�ɫ��Element��������һ��Accept����������һ��������Ϊ������<br>
 * �˵ĳ�����<br>
 * @author Administrator
 */
public interface Person {

  /**
   * ����,vistor�������״̬����<br>
   * @param visitor
   */
  public void accept(Action visitor);

}
