package dps_03_action_type.dp11_visitor.example3.concrete_visitor;

import dps_03_action_type.dp11_visitor.example3.concrete_element.Chrysanthemum;
import dps_03_action_type.dp11_visitor.example3.concrete_element.Peony;
import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * 具体访问者角色（Concrete Visitor）：实现每个由访问者角色（Visitor）声明的操作。<br>
 * 人工授花技术<br>
 * @author Administrator
 */
public class Manpower implements Deflower {

  /**
   * 处理菊花的花粉<br>
   * @param element 
   */
  public void processChrysanthemumDust(@SuppressWarnings("unused")
  Chrysanthemum element) {
    System.out.println(getClass().getSimpleName() + "正在采集菊花.");
  }

  /**
   * 处理牡丹花的花粉<br>
   * @param element 
   */
  public void processPeonyDust(@SuppressWarnings("unused")
  Peony element) {
    System.out.println(getClass().getSimpleName() + "正在采集牡丹花.");
  }

}
