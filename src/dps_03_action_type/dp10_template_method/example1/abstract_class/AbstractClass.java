package dps_03_action_type.dp10_template_method.example1.abstract_class;

/**
 * 抽象模版（AbstractClass）角色有如下的责任： <br>
 * 定义了一个或多个抽象操作，以便让子类实现。这些抽象操作叫做基本操作，它们是一个顶级逻辑的组成步骤。<br>
 * 定义并实现了一个模版方法。这个模版方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，<br>
 * 而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。<br>
 * @author Administrator
 */
public abstract class AbstractClass {

  /**
   * 抽象行为1
   */
  public abstract void primitiveOperation1();

  /**
   * 抽象行为1
   */
  public abstract void primitiveOperation2();

  /**
   * 模板方法,给出逻辑的框架
   */
  public void templateMethod() {
    primitiveOperation1();
    primitiveOperation2();
    System.out.println("其他操作.");
  }

}
