package dps_03_action_type.dp01_chain_of_responsibility.example4;

import dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler.AuthFilter;
import dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler.OtherFilter;
import dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler.URLRewriteFilter;
import dps_03_action_type.dp01_chain_of_responsibility.example4.handler.BaseFilter;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //实现抽象处理者角色:
    BaseFilter otherfilter = new OtherFilter();//具体处理者角色:处理其他过滤工作的过滤器
    BaseFilter urlfilter = new URLRewriteFilter();//具体处理者角色:处理url的过滤器
    BaseFilter authfilter = new AuthFilter();//具体处理者角色:处理身份验证的过滤器

    otherfilter.setNextFilter(urlfilter);// 设置下家
    urlfilter.setNextFilter(authfilter);// 设置下家

    otherfilter.executeFilter();//执行过滤
  }

}
