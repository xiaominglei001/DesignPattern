package dps_02_structure_type.dp03_composite.sheer.example1.leaf;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.sheer.example1.component.Component;

/**
 * Ҷ��:���νṹ��Ҷ�ڵ�,Component��ʵ������<br>
 * @author Administrator
 */
public class Leaf extends Component {

  /**
   * ���캯��<br>
   * @param name
   */
  public Leaf(String name) {
    super(name);
  }

  /**
   * ����һ������<br>
   * @param c 
   */
  public void add(@SuppressWarnings("unused")
  Component c) {
    System.out.println("Cannot add to a leaf.");
  }

  /**
   * ɾ��һ������<br>
   * @param c 
   */
  public void remove(@SuppressWarnings("unused")
  Component c) {
    System.out.println("Cannot remove from a leaf.");
  }

  /**
   * ��ӡ���ڵ���Ϣ
   * @param depth 
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
  }

}
