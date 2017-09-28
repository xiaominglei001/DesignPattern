package dps_02_structure_type.dp06_flyweight.example3;

/**
 * 不属于享元模式的角色,这里封装用户信息<br>
 * @author Administrator
 */
public class User {

  /**名字*/
  private String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public User(String name) {
    super();
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

}