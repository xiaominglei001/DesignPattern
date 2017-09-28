package dps_03_action_type.dp11_visitor.example3;

import dps_03_action_type.dp11_visitor.example3.concrete_element.Chrysanthemum;
import dps_03_action_type.dp11_visitor.example3.concrete_element.Peony;
import dps_03_action_type.dp11_visitor.example3.concrete_visitor.Bee;
import dps_03_action_type.dp11_visitor.example3.concrete_visitor.Butterfly;
import dps_03_action_type.dp11_visitor.example3.concrete_visitor.Manpower;
import dps_03_action_type.dp11_visitor.example3.object_structure.Farm;

/**
 * 测试类:假设采花的动物有蝴蝶,蜜蜂,人工技术授花等等,可能有很多种,而花只有两种并且以后不会再有增加<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //对象结构角色:农场
    Farm f = new Farm();
    f.attach(new Chrysanthemum());
    f.attach(new Peony());

    //具体访问者角色:蜜蜂,蝴蝶,人工授花
    Bee v1 = new Bee();
    Butterfly v2 = new Butterfly();
    Manpower v3 = new Manpower();

    //遍历元素,并接受访问者开始繁殖
    f.breed(v1);
    f.breed(v2);
    f.breed(v3);
  }

}
