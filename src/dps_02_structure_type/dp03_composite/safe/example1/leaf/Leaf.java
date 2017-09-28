package dps_02_structure_type.dp03_composite.safe.example1.leaf;

import util.StringUtil;

import dps_02_structure_type.dp03_composite.safe.example1.component.Component;

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
   * ��ӡ���ڵ���Ϣ
   * @param depth 
   */
  public void display(int depth) {
    System.out.println(StringUtil.join("-", depth) + name);
  }

}
