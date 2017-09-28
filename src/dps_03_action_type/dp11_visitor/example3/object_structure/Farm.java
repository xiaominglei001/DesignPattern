/**
 * 
 */
package dps_03_action_type.dp11_visitor.example3.object_structure;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp11_visitor.example3.element.Flower;
import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * ����ṹ��ɫ��Object Structure��������ʹ�÷�����ģʽ�ر��Ľ�ɫ��<br>
 * ��Ҫ�߱�������������ö������Ԫ�أ������ṩһ���߲�Ľӿ�������÷����߷�������Ԫ�أ�<br>
 * ������һ�����ϣ����ģʽ������һ�����ϣ���һ���б��һ�����򼯺ϡ�<br>
 * ũ��<br>
 * @author Administrator
 */
public class Farm {

  /**�����洢����Ԫ��(��)�ļ���*/
  private List<Flower> elements = new ArrayList<Flower>();

  /**
   * ���Ӿ���Ԫ��(��)<br>
   * @param element
   */
  public void attach(Flower element) {
    elements.add(element);
  }

  /**
   * �Ƴ�����Ԫ��(��)<br>
   * @param element
   */
  public void detach(Flower element) {
    elements.remove(element);
  }

  /**
   * ����Ԫ��,��ʼ�ɻ�,��ֳ<br>
   * @param visitor
   */
  public void breed(Deflower visitor) {
    for (Flower element : elements) {
      element.accept(visitor);
    }
  }

}
