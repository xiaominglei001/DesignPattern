package dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example3.Request;
import dps_03_action_type.dp01_chain_of_responsibility.example3.handler.Manager;

/**
 * 具体处理者角色（Concrete Handler）：实现抽象角色中定义的接口，并处理它所负责的请求。如果不能处理则访问它的后继者。<br>
 * 总监<br>
 * @author Administrator
 */
public class Mojordomo extends Manager {

  /**
   * 构造函数<br>
   * @param name
   */
  public Mojordomo(String name) {
    super(name);
  }

  /**
   * 处理方法,调用此方法处理请求
   * @param request 
   */
  public void requestApplication(Request request) {
    String desc = "[" + request.getContent() + " 数量" + request.getNumber()
        + "]";
    if ("请假".equals(request.getType()) && request.getNumber() <= 5) {
      System.out.println(name + ":" + desc + " 被批准");
    } else if (superior != null) {
      superior.requestApplication(request);
    } else {
      System.out.println(name + ":这个请求无法被处理" + desc);
    }
  }

}