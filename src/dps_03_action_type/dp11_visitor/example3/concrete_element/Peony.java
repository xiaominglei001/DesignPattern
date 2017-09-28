package dps_03_action_type.dp11_visitor.example3.concrete_element;

import dps_03_action_type.dp11_visitor.example3.element.Flower;
import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * ����Ԫ�ؽ�ɫ��Concrete Element����ʵ����Ԫ�ؽ�ɫ�ṩ��Accept������<br>
 * ĵ����<br>
 * @author Administrator
 */
public class Peony implements Flower {

  /**
   * ���ܲɻ�,vistor������òɻ��߶���<br>
   * @param visitor
   */
  public void accept(Deflower visitor) {
    visitor.processPeonyDust(this);
  }

}
