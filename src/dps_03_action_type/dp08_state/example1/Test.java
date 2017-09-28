package dps_03_action_type.dp08_state.example1;

import dps_03_action_type.dp08_state.example1.concrete_state.ConcreteStateA;
import dps_03_action_type.dp08_state.example1.context.Context;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    //使用环境（Context）角色
    Context c = new Context(new ConcreteStateA());//初始状态
    for (int i = 0; i < 5; i++) {
      //请求
      c.request();
      //休息一会模拟状态的切换所需时间
      Thread.sleep(500);
    }
  }

}
