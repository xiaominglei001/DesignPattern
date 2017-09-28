package dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example4.handler.BaseFilter;

/**
 * 具体处理者角色（Concrete Handler）：实现抽象角色中定义的接口，并处理它所负责的请求。如果不能处理则访问它的后继者。<br>
 * 处理身份验证的过滤器<br>
 * @author Administrator
 */
public class AuthFilter extends BaseFilter {

  /**
   * 执行过滤
   */
  public void executeFilter() {
    System.out.println("1.check the user in this filter!");
    doNextFilter();
    System.out.println("2.check the user in this filter!");
  }

}