package dps_02_structure_type.dp02_bridge.example1;

import dps_02_structure_type.dp02_bridge.example1.abstraction.Abstraction;
import dps_02_structure_type.dp02_bridge.example1.concrete_implementor.ConcreteImplementorA;
import dps_02_structure_type.dp02_bridge.example1.concrete_implementor.ConcreteImplementorB;
import dps_02_structure_type.dp02_bridge.example1.refined_abstraction.RefinedAbstraction;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象化角色(Abstraction)：抽象化接口定义
    Abstraction a = new RefinedAbstraction();

    //具体实现化角色(Concrete Implementor)：实现化角色接口的具体实现
    a.setImplementor(new ConcreteImplementorA());
    a.operation();//执行具体操作

    a.setImplementor(new ConcreteImplementorB());
    a.operation();//执行具体操作
  }

}
