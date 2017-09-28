package dps_03_action_type.dp11_visitor.example2.object_structure;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp11_visitor.example2.element.Person;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * 对象结构角色（Object Structure）：这是使用访问者模式必备的角色。<br>
 * 它要具备以下特征：能枚举它的元素；可以提供一个高层的接口以允许该访问者访问它的元素；<br>
 * 可以是一个复合（组合模式）或是一个集合，如一个列表或一个无序集合。<br>
 * 对象结构<br>
 * @author Administrator
 */
public class ObjectStructure {

  /**存储元素(人)的集合*/
  private List<Person> elements = new ArrayList<Person>();

  /**
   * 增加元素(人)<br>
   * @param element
   */
  public void attach(Person element) {
    elements.add(element);
  }

  /**
   * 移除元素(人)<br>
   * @param element
   */
  public void detach(Person element) {
    elements.remove(element);
  }

  /**
   * 遍历元素,查看显示<br>
   * @param visitor
   */
  public void display(Action visitor) {
    for (Person element : elements) {
      element.accept(visitor);
    }
  }

}
