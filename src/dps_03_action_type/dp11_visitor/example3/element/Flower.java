package dps_03_action_type.dp11_visitor.example3.element;

import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * Ԫ�ؽ�ɫ��Element��������һ��Accept����������һ��������Ϊ������<br>
 * ���ĳ�����<br>
 * @author Administrator
 */
public interface Flower {

  /**
   * ���ܲɻ�,vistor������òɻ��߶���<br>
   * @param visitor
   */
  public void accept(Deflower visitor);

}
