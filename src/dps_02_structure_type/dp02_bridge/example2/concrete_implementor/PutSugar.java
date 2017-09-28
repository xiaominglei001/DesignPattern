package dps_02_structure_type.dp02_bridge.example2.concrete_implementor;

import dps_02_structure_type.dp02_bridge.example2.implementor.Action;

/**
 * 具体实现化角色(Concrete Implementor)：实现化角色接口的具体实现<br>
 * 行为:加糖<br>
 * @author Administrator
 */
public class PutSugar implements Action {

  /**加糖的动作*/
  public void execute() {
    System.out.println("加糖");
  }

}
