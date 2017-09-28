package dps_02_structure_type.dp03_composite.safe.example1.composite;

import java.util.ArrayList;
import java.util.List;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.safe.example1.component.Component;

/**
 * 树干(Composite)<br>
 * @author Administrator
 */
public class Composite extends Component {

  /**所有的孩子*/
  private List<Component> children;

  /**
   * 构造函数<br>
   * @param name
   */
  public Composite(String name) {
    super(name);
    children = new ArrayList<Component>();
  }

  /**
   * 增加一个孩子<br>
   * @param c 
   */
  public void add(Component c) {
    children.add(c);
  }

  /**
   * 删除一个孩子<br>
   * @param c 
   */
  public void remove(Component c) {
    children.remove(c);
  }

  /**
   * 打印出节点信息
   * @param depth 
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
    for (Component c : children) {
      c.display(depth + 2);
    }
  }

}
