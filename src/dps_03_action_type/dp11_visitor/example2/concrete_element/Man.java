package dps_03_action_type.dp11_visitor.example2.concrete_element;

import dps_03_action_type.dp11_visitor.example2.element.Person;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * ����Ԫ�ؽ�ɫ��Concrete Element����ʵ����Ԫ�ؽ�ɫ�ṩ��Accept������<br>
 * ����<br>
 * @author Administrator
 */
public class Man implements Person {

  /**
   * ����һ��������<br>
   * @param visitor
   */
  public void accept(Action visitor) {
    //�����ڿͻ������н�����״̬��Ϊ�������ݸ�������"�����һ�η��ɣ�
    //Ȼ�������������Ϊ�����ġ�����״̬���еķ��������˷�Ӧ����ͬʱ���Լ�(this)��Ϊ�������ݽ�ȥ���������˵ڶ��η���
    visitor.getManConclusion(this);
  }

}
