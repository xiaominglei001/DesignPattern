package dps_02_structure_type.dp03_composite.sheer.example1;

import dps_02_structure_type.dp03_composite.sheer.example1.composite.Composite;
import dps_02_structure_type.dp03_composite.sheer.example1.leaf.Leaf;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //树干(Composite,这里定义根节点)
    Composite root = new Composite("root");
    root.add(new Leaf("Leaf A"));//加叶子
    root.add(new Leaf("Leaf B"));//加叶子

    //树干(Composite)
    Composite comp = new Composite("Composite X");
    comp.add(new Leaf("Leaf XA"));//加叶子
    comp.add(new Leaf("Leaf XB"));//加叶子

    root.add(comp);//加树干

    //树干(Composite)
    Composite comp2 = new Composite("Composite XY");
    comp2.add(new Leaf("Leaf XYA"));//加叶子
    comp2.add(new Leaf("Leaf XYB"));//加叶子

    comp.add(comp2);//加树干

    root.add(new Leaf("Leaf C"));//加叶子

    Leaf leaf = new Leaf("Leaf D");
    root.add(leaf);//加叶子
    root.remove(leaf);//没长牢,被风吹走了

    //打印出节点信息
    root.display(1);
  }

}
