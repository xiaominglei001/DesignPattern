package dps_02_structure_type.dp02_bridge.example1.concrete_implementor;

import dps_02_structure_type.dp02_bridge.example1.implementor.Implementor;

/**
 * 具体实现化角色(Concrete Implementor)：实现化角色接口的具体实现<br>
 * @author Administrator
 */
public class ConcreteImplementorB implements Implementor {

  /**
   * 运行具体操作
   */
  public void operation() {
    System.out.println("具体实现B的方法执行.");
  }

}
