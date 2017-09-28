package dps_03_action_type.dp09_strategy.example1;

import dps_03_action_type.dp09_strategy.example1.concrete_strategy.ConcreteStrategyA;
import dps_03_action_type.dp09_strategy.example1.concrete_strategy.ConcreteStrategyB;
import dps_03_action_type.dp09_strategy.example1.concrete_strategy.ConcreteStrategyC;
import dps_03_action_type.dp09_strategy.example1.context.Context;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //环境角色
    Context context = new Context(new ConcreteStrategyA());//具体策略角色:具体算法A
    context.contextInterface();

    context = new Context(new ConcreteStrategyB());//具体策略角色:具体算法B
    context.contextInterface();

    context = new Context(new ConcreteStrategyC());//具体策略角色:具体算法C
    context.contextInterface();
  }
}
