package dps_03_action_type.dp11_visitor.example1.object_structure;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp11_visitor.example1.element.Element;
import dps_03_action_type.dp11_visitor.example1.visitor.Visitor;

/**
 * 对象结构角色（Object Structure）：这是使用访问者模式必备的角色。<br>
 * 它要具备以下特征：能枚举它的元素；可以提供一个高层的接口以允许该访问者访问它的元素；<br>
 * 可以是一个复合（组合模式）或是一个集合，如一个列表或一个无序集合。<br>
 * @author Administrator
 */
public class ObjectStructure {

  /**存储元素的集合*/
  private List<Element> elements = new ArrayList<Element>();

  /**
   * 增加元素<br>
   * @param element
   */
  public void attach(Element element) {
    elements.add(element);
  }

  /**
   * 移除元素<br>
   * @param element
   */
  public void detach(Element element) {
    elements.remove(element);
  }

  /**
   * 遍历元素,并接受访问者<br>
   * @param visitor
   */
  public void accept(Visitor visitor) {
    for (Element element : elements) {
      element.accept(visitor);
    }
  }

}
