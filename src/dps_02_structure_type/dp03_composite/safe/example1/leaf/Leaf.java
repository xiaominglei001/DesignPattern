package dps_02_structure_type.dp03_composite.safe.example1.leaf;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.safe.example1.component.Component;

/**
 * 叶子:树形结构的叶节点,Component的实现子类<br>
 * @author Administrator
 */
public class Leaf extends Component {

  /**
   * 构造函数<br>
   * @param name
   */
  public Leaf(String name) {
    super(name);
  }

  /**
   * 打印出节点信息
   * @param depth 
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
  }

}
