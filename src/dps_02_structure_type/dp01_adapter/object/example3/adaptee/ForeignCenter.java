package dps_02_structure_type.dp01_adapter.object.example3.adaptee;

/***
 * 源（Adaptee）角色:需要适配的类<br>
 * 外籍中锋<br>
 * @author Administrator
 */
public class ForeignCenter {

  /**名字:用属性而不用构造函数来区别与前三个球员类的不同*/
  private String name;

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
   * 进攻
   */
  public void 进攻() {
    System.out.println("外籍中锋 " + name + " 进攻");
  }

  /**
   * 防守
   */
  public void 防守() {
    System.out.println("外籍中锋 " + name + " 防守");
  }

}
