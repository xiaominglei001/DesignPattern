package dps_02_structure_type.dp06_flyweight.example2.flyweight;

/**
 * 抽象享元(Flyweight)角色:此角色是所有的具体享元类的基类,为这些类规定出需要实现的公共接口<br>
 * 这里是食物<br>
 * @author Administrator
 */
public abstract class AbsFood {

  /**菜名*/
  protected String name;

  /**
   * @param name
   */
  public AbsFood(String name) {
    this.name = name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 公共接口,要求子类实现
   */
  public abstract void display();

}