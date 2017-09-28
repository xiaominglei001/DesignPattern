package dps_02_structure_type.dp03_composite.safe.example1.composite;

import java.util.ArrayList;
import java.util.List;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.safe.example1.component.Component;

/**
 * ����(Composite)<br>
 * @author Administrator
 */
public class Composite extends Component {

  /**���еĺ���*/
  private List<Component> children;

  /**
   * ���캯��<br>
   * @param name
   */
  public Composite(String name) {
    super(name);
    children = new ArrayList<Component>();
  }

  /**
   * ����һ������<br>
   * @param c 
   */
  public void add(Component c) {
    children.add(c);
  }

  /**
   * ɾ��һ������<br>
   * @param c 
   */
  public void remove(Component c) {
    children.remove(c);
  }

  /**
   * ��ӡ���ڵ���Ϣ
   * @param depth 
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
    for (Component c : children) {
      c.display(depth + 2);
    }
  }

}
