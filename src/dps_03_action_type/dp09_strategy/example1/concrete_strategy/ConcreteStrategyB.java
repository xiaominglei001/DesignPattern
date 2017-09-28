package dps_03_action_type.dp09_strategy.example1.concrete_strategy;

import dps_03_action_type.dp09_strategy.example1.strategy.Strategy;

/**
 * 具体策略角色:具体算法B<br>
 * @author Administrator
 */
public class ConcreteStrategyB implements Strategy {

  /**
   * 算法
   */
  public void algorithmInterface() {
    System.out.println("算法B实现");
  }

}
