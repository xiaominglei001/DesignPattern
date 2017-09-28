package dps_01_build_type.dp02_factory.abstract_factory.example1.model;

/**
 * 不属于抽象工厂模式的角色:模型类(用户)<br>
 * @author Administrator
 */
public class User {

  /**用户ID*/
  private String userid;
  /**用户名*/
  private String username;

  /**
   * @return the userid
   */
  public String getUserid() {
    return userid;
  }

  /**
   * @param userid the userid to set
   */
  public void setUserid(String userid) {
    this.userid = userid;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

}
