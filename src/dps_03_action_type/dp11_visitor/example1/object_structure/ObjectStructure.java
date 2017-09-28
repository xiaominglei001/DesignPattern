package dps_03_action_type.dp11_visitor.example1.object_structure;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp11_visitor.example1.element.Element;
import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * ����ṹ��ɫ��Object Structure��������ʹ�÷�����ģʽ�ر��Ľ�ɫ��<br>
 * ��Ҫ�߱�������������ö������Ԫ�أ������ṩһ���߲�Ľӿ�������÷����߷�������Ԫ�أ�<br>
 * ������һ�����ϣ����ģʽ������һ�����ϣ���һ���б��һ�����򼯺ϡ�<br>
 * @author Administrator
 */
public class ObjectStructure {

  /**�洢Ԫ�صļ���*/
  private List<Element> elements = new ArrayList<Element>();

  /**
   * ����Ԫ��<br>
   * @param element
   */
  public void attach(Element element) {
    elements.add(element);
  }

  /**
   * �Ƴ�Ԫ��<br>
   * @param element
   */
  public void detach(Element element) {
    elements.remove(element);
  }

  /**
   * ����Ԫ��,�����ܷ�����<br>
   * @param visitor
   */
  public void accept(Visitor visitor) {
    for (Element element : elements) {
      element.accept(visitor);
    }
  }

}
