package dps_03_action_type.dp01_chain_of_responsibility.example2.handler;

/**
 * 抽象处理者角色（Handler）：它定义了一个处理请求的接口。当然对于链子的不同实现，也可以在这个角色中实现后继链。<br>
 * 处理请求有接口<br>
 * @author Administrator
 */
public abstract class Handler {

  /**定义下家的引用*/
  protected Handler successor;

  /**
   * 处理方法,调用此方法处理请求
   * @param request 
   */
  public abstract void handleRequest(int request);

  /**
   * 赋值方法，调用此方法设置下家<br>
   * @param successor
   */
  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

}