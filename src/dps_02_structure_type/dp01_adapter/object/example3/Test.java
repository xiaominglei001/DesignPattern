package dps_02_structure_type.dp01_adapter.object.example3;

import dps_02_structure_type.dp01_adapter.object.example3.adaptee.Forwards;
import dps_02_structure_type.dp01_adapter.object.example3.adaptee.Guards;
import dps_02_structure_type.dp01_adapter.object.example3.adapter.Translator;
import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //目标（Target）角色:球员,正常实现目标接口的类
    Player b = new Forwards("巴蒂尔");
    b.attack();//进攻
    b.defense();//防守

    //目标（Target）角色:球员,正常实现目标接口的类
    Player m = new Guards("麦克尔雷迪");
    m.attack();//进攻
    m.defense();//防守

    //目标（Target）角色:球员,靠适配才实现目标接口的类
    Player y = new Translator("姚明");
    y.attack();//进攻
    y.defense();//防守
  }

}
