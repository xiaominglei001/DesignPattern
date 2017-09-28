package dps_03_action_type.dp11_visitor.example2.concrete_visitor;

import dps_03_action_type.dp11_visitor.example2.concrete_element.Man;
import dps_03_action_type.dp11_visitor.example2.concrete_element.Woman;
import dps_03_action_type.dp11_visitor.example2.visitor.Action;

/**
 * 具体访问者角色（Concrete Visitor）：实现每个由访问者角色（Visitor）声明的操作。<br>
 * 失败时<br>
 * @author Administrator
 */
public class Failing implements Action {

  /**
   * 得到男人结论或反应<br>
   * @param concreteElementA
   */
  public void getManConclusion(Man concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + " "
        + getClass().getSimpleName() + "时，闷头喝酒，谁也不用劝。");
  }

  /**
   * 得到女人结论或反应<br>
   * @param concreteElementB
   */
  public void getWomanConclusion(Woman concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + " "
        + getClass().getSimpleName() + "时，眼泪汪汪，谁也劝不了。");
  }

}
