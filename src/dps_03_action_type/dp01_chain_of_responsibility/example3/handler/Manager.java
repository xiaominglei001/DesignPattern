package dps_03_action_type.dp01_chain_of_responsibility.example3.handler;

import dps_03_action_type.dp01_chain_of_responsibility.example3.Request;

/**
 * 抽象处理者角色（Handler）：它定义了一个处理请求的接口。当然对于链子的不同实现，也可以在这个角色中实现后继链。<br>
 * 抽象管理者<br>
 * @author Administrator
 */
public abstract class Manager {

  /**管理者的名字*/
  protected String name;
  /**管理者的上级*/
  protected Manager superior;

  /**
   * 构造函数<br>
   * @param name
   */
  public Manager(String name) {
    this.name = name;
  }

  /**
   * 处理方法,调用此方法处理请求
   * @param request 
   */
  public abstract void requestApplication(Request request);

  /**
   * 赋值方法，调用此方法设置上级<br>
   * @param superior
   */
  public void setSuperior(Manager superior) {
    this.superior = superior;
  }

}