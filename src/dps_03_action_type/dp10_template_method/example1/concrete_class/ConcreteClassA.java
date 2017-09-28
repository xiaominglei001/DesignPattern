package dps_03_action_type.dp10_template_method.example1.concrete_class;

import dps_03_action_type.dp10_template_method.example1.abstract_class.AbstractClass;

/**
 * 具体模版（ConcreteClass）角色有如下的责任：<br>
 * 实现父类所定义的一个或多个抽象方法，它们是一个顶级逻辑的组成步骤。<br>
 * 每一个抽象模版角色都可以有任意多个具体模版角色与之对应，而每一个具体模版角色都可以给出这些抽象方法<br>
 * （也就是顶级逻辑的组成步骤）的不同实现，从而使得顶级逻辑的实现各不相同。<br>
 * @author Administrator
 */
public class ConcreteClassA extends AbstractClass {

  /**
   * 具体行为1
   */
  public void primitiveOperation1() {
    System.out.println("具体模板A实现行为1.");
  }

  /**
   * 具体行为1
   */
  public void primitiveOperation2() {
    System.out.println("具体模板A实现行为2.");
  }

}
