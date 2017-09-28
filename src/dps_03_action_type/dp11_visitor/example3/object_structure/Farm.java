/**
 * 
 */
package dps_03_action_type.dp11_visitor.example3.object_structure;

import java.util.ArrayList;
import java.util.List;

import dps_03_action_type.dp11_visitor.example3.element.Flower;
import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * 对象结构角色（Object Structure）：这是使用访问者模式必备的角色。<br>
 * 它要具备以下特征：能枚举它的元素；可以提供一个高层的接口以允许该访问者访问它的元素；<br>
 * 可以是一个复合（组合模式）或是一个集合，如一个列表或一个无序集合。<br>
 * 农场<br>
 * @author Administrator
 */
public class Farm {

  /**用来存储具体元素(花)的集合*/
  private List<Flower> elements = new ArrayList<Flower>();

  /**
   * 增加具体元素(花)<br>
   * @param element
   */
  public void attach(Flower element) {
    elements.add(element);
  }

  /**
   * 移除具体元素(花)<br>
   * @param element
   */
  public void detach(Flower element) {
    elements.remove(element);
  }

  /**
   * 遍历元素,开始采花,繁殖<br>
   * @param visitor
   */
  public void breed(Deflower visitor) {
    for (Flower element : elements) {
      element.accept(visitor);
    }
  }

}
