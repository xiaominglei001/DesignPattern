package dps_03_action_type.dp11_visitor.example2.concrete_element;

import dps_03_action_type.dp11_visitor.example2.element.Person;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * ����Ԫ�ؽ�ɫ��Concrete Element����ʵ����Ԫ�ؽ�ɫ�ṩ��Accept������<br>
 * Ů��<br>
 * @author Administrator
 */
public class Woman implements Person {

  /**
   * ����һ��������<br>
   * @param visitor
   */
  public void accept(Action visitor) {
    //�����ڿͻ������н�����״̬��Ϊ�������ݸ���Ů��"�����һ�η��ɣ�
    //Ȼ��Ů���������Ϊ�����ġ�����״̬���еķ�����Ů�˷�Ӧ����ͬʱ���Լ�(this)��Ϊ�������ݽ�ȥ���������˵ڶ��η���
    visitor.getWomanConclusion(this);
  }

}
