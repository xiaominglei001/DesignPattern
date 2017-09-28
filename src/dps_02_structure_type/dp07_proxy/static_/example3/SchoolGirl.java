package dps_02_structure_type.dp07_proxy.static_.example3;

/**
 * 不属于代理模式的角色:封装一个女生的相关属性<br>
 * @author Administrator
 */
public class SchoolGirl {

  /**名字*/
  private String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public SchoolGirl(String name) {
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
