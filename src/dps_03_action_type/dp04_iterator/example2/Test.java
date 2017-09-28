package dps_03_action_type.dp04_iterator.example2;

import dps_03_action_type.dp04_iterator.example2.concrete_container.ConcreteAggregate;
import dps_03_action_type.dp04_iterator.example2.iterator.Iterator;

/**
 * ������<br>
 * �����͵ĵ�����<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����������ɫ��Concrete Container����
    ConcreteAggregate<String> ca = new ConcreteAggregate<String>();
    //������Ԫ��
    ca.add("����");
    ca.add("С��");
    ca.add("С��");
    ca.add("����");
    ca.add("��˾�ڲ�Ա��");
    ca.add("С͵");

    System.out.println("�����͵ĵ�����:");
    //��������ɫ��Iterator����
    Iterator<String> iterator = ca.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());//��ȡ��һ��Ԫ��
    }
  }

}
