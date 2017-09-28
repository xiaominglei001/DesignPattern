package dps_03_action_type.dp08_state.example3;

import dps_03_action_type.dp08_state.example3.context.Player;

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
    Player p = new Player();
    for (int i = 0; i < 10; i++) {
      //投篮
      p.shot();
      //休息一会模拟状态的切换所需时间
      Thread.sleep(500);
    }
  }

}
