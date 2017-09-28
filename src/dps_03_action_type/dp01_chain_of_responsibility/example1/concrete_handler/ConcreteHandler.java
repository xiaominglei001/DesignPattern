package dps_03_action_type.dp01_chain_of_responsibility.example1.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example1.handler.Handler;

/**
 * 具体处理者角色（Concrete Handler）：实现抽象角色中定义的接口，并处理它所负责的请求。如果不能处理则访问它的后继者。<br>
 * @author Administrator
 */
public class ConcreteHandler extends Handler {

  /**
   * 处理方法,调用此方法处理请求,下家为空自己处理,下家不为空,交给下家处理.
   */
  public void handleRequest() {
    if (successor == null) {
      System.out.println("The request is handled here.");
    } else {
      System.out.println("The request is passed to [ " + successor + " ]");
      successor.handleRequest();
    }
  }

}