package dps_02_structure_type.dp01_adapter.object.example3.target;

/**
 * 目标（Target）角色:球员<br>
 * 这是客户所期待的接口,目标可以是具体的或抽象的类,也可以是接口.<br>
 * @author Administrator
 */
public abstract class Player {

  /**名字*/
  protected String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public Player(String name) {
    this.name = name;
  }

  /**
   * 进攻
   */
  public abstract void attack();

  /**
   * 防守
   */
  public abstract void defense();

}
