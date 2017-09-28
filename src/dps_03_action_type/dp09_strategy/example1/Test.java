package dps_03_action_type.dp09_strategy.example1;

import dps_03_action_type.dp09_strategy.example1.concrete_strategy.ConcreteStrategyA;
import dps_03_action_type.dp09_strategy.example1.concrete_strategy.ConcreteStrategyB;
import dps_03_action_type.dp09_strategy.example1.concrete_strategy.ConcreteStrategyC;
import dps_03_action_type.dp09_strategy.example1.context.Context;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //������ɫ
    Context context = new Context(new ConcreteStrategyA());//������Խ�ɫ:�����㷨A
    context.contextInterface();

    context = new Context(new ConcreteStrategyB());//������Խ�ɫ:�����㷨B
    context.contextInterface();

    context = new Context(new ConcreteStrategyC());//������Խ�ɫ:�����㷨C
    context.contextInterface();
  }
}
