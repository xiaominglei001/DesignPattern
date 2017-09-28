package dps_03_action_type.dp11_visitor.example2.object_structure;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp11_visitor.example2.element.Person;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * ����ṹ��ɫ��Object Structure��������ʹ�÷�����ģʽ�ر��Ľ�ɫ��<br>
 * ��Ҫ�߱�������������ö������Ԫ�أ������ṩһ���߲�Ľӿ�������÷����߷�������Ԫ�أ�<br>
 * ������һ�����ϣ����ģʽ������һ�����ϣ���һ���б��һ�����򼯺ϡ�<br>
 * ����ṹ<br>
 * @author Administrator
 */
public class ObjectStructure {

  /**�洢Ԫ��(��)�ļ���*/
  private List<Person> elements = new ArrayList<Person>();

  /**
   * ����Ԫ��(��)<br>
   * @param element
   */
  public void attach(Person element) {
    elements.add(element);
  }

  /**
   * �Ƴ�Ԫ��(��)<br>
   * @param element
   */
  public void detach(Person element) {
    elements.remove(element);
  }

  /**
   * ����Ԫ��,�鿴��ʾ<br>
   * @param visitor
   */
  public void display(Action visitor) {
    for (Person element : elements) {
      element.accept(visitor);
    }
  }

}
