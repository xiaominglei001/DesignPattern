package dps_03_action_type.dp10_template_method.example1;

import dps_03_action_type.dp10_template_method.example1.abstract_class.AbstractClass;
import dps_03_action_type.dp10_template_method.example1.concrete_class.ConcreteClassA;
import dps_03_action_type.dp10_template_method.example1.concrete_class.ConcreteClassB;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象模版,具体模版A
    AbstractClass c1 = new ConcreteClassA();
    c1.templateMethod();

    System.out.println();
    //抽象模版,具体模版B
    AbstractClass c2 = new ConcreteClassB();
    c2.templateMethod();
  }

}
