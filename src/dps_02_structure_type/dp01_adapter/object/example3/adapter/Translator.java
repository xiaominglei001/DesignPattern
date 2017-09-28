package dps_02_structure_type.dp01_adapter.object.example3.adapter;

import dps_02_structure_type.dp01_adapter.object.example3.adaptee.ForeignCenter;
import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * 适配器（Adapter）角色:把源接口转换成目标接口,这一角色必须是类.<br>
 * @author Administrator
 */
public class Translator extends Player {

  /**外籍中锋*/
  private ForeignCenter wjzf;

  /**
   * 构造函数<br>
   * @param name 
   */
  public Translator(String name) {
    super(name);
    wjzf = new ForeignCenter();
    wjzf.setName(name);
  }

  /**
   * 进攻
   */
  public void attack() {
    wjzf.进攻();
  }

  /**
   * 防守
   */
  public void defense() {
    wjzf.防守();
  }

}
