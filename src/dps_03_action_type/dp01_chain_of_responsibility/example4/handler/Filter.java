package dps_03_action_type.dp01_chain_of_responsibility.example4.handler;

/**
 * 抽象处理者角色（Handler）：它定义了一个处理请求的接口。当然对于链子的不同实现，也可以在这个角色中实现后继链。<br>
 * 过滤器接口<br>
 * @author Administrator
 */
public interface Filter {

  /**
   * 执行过滤
   */
  public void executeFilter();

}
