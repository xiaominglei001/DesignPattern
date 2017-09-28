package dps_02_structure_type.dp03_composite.sheer.example1;

import dps_02_structure_type.dp03_composite.sheer.example1.composite.Composite;
import dps_02_structure_type.dp03_composite.sheer.example1.leaf.Leaf;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����(Composite,���ﶨ����ڵ�)
    Composite root = new Composite("root");
    root.add(new Leaf("Leaf A"));//��Ҷ��
    root.add(new Leaf("Leaf B"));//��Ҷ��

    //����(Composite)
    Composite comp = new Composite("Composite X");
    comp.add(new Leaf("Leaf XA"));//��Ҷ��
    comp.add(new Leaf("Leaf XB"));//��Ҷ��

    root.add(comp);//������

    //����(Composite)
    Composite comp2 = new Composite("Composite XY");
    comp2.add(new Leaf("Leaf XYA"));//��Ҷ��
    comp2.add(new Leaf("Leaf XYB"));//��Ҷ��

    comp.add(comp2);//������

    root.add(new Leaf("Leaf C"));//��Ҷ��

    Leaf leaf = new Leaf("Leaf D");
    root.add(leaf);//��Ҷ��
    root.remove(leaf);//û����,���紵����

    //��ӡ���ڵ���Ϣ
    root.display(1);
  }

}
