package dps_02_structure_type.dp02_bridge.example1.refined_abstraction;

import dps_02_structure_type.dp02_bridge.example1.abstraction.Abstraction;

/**
 * 具体抽象化角色(Refined Abstraction)：抽象化具体实现<br>
 * @author Administrator
 */
public class RefinedAbstraction extends Abstraction {

  /**
   * 执行具体操作
   */
  public void operation() {
    implementor.operation();
  }

}
