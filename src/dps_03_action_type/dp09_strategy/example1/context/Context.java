package dps_03_action_type.dp09_strategy.example1.context;

import dps_03_action_type.dp09_strategy.example1.strategy.Strategy;

/**
 * 环境角色,客户端调用对象<br>
 * @author Administrator
 */
public class Context {

  /**抽象算法*/
  private Strategy strategy;

  /**
   * 构造函数<br>
   * @param strategy
   */
  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  /**
   * 上下文接口
   */
  public void contextInterface() {
    strategy.algorithmInterface();
  }

}
