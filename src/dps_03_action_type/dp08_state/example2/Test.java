package dps_03_action_type.dp08_state.example2;

import dps_03_action_type.dp08_state.example2.context.Person;

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
    //使用环境（Context）角色：人
    Person p = new Person();
    for (int i = 0; i < 10; i++) {
      //干活
      p.doSomething();
      //休息一会模拟状态的切换所需时间
      Thread.sleep(500);
    }
  }

}
