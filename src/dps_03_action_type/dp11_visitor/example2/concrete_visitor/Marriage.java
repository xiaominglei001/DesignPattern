package dps_03_action_type.dp11_visitor.example2.concrete_visitor;

import dps_03_action_type.dp11_visitor.example2.concrete_element.Man;
import dps_03_action_type.dp11_visitor.example2.concrete_element.Woman;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * 具体访问者角色（Concrete Visitor）：实现每个由访问者角色（Visitor）声明的操作。<br>
 * 结婚时<br>
 * @author Administrator
 */
public class Marriage implements Action {

  /**
   * 得到男人结论或反应<br>
   * @param concreteElementA
   */
  public void getManConclusion(Man concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + " "
        + getClass().getSimpleName() + "时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期。");
  }

  /**
   * 得到女人结论或反应<br>
   * @param concreteElementB
   */
  public void getWomanConclusion(Woman concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + " "
        + getClass().getSimpleName() + "时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。");
  }

}
