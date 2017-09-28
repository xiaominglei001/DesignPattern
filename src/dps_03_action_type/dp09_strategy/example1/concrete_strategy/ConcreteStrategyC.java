package dps_03_action_type.dp09_strategy.example1.concrete_strategy;

import dps_03_action_type.dp09_strategy.example1.strategy.Strategy;

/**
 * 具体策略角色:具体算法C<br>
 * @author Administrator
 */
public class ConcreteStrategyC implements Strategy {

  /**
   * 算法
   */
  public void algorithmInterface() {
    System.out.println("算法C实现");
  }

}
