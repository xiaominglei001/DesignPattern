package dps_01_build_type.dp02_factory.abstract_factory.example2.model;

/**
 * 不属于抽象工厂模式的角色:模型类(部门)<br>
 * @author Administrator
 */
public class Dept {

  /**部门ID*/
  private String deptid;
  /**部门名称*/
  private String deptname;

  /**
   * @return the deptid
   */
  public String getDeptid() {
    return deptid;
  }

  /**
   * @param deptid the deptid to set
   */
  public void setDeptid(String deptid) {
    this.deptid = deptid;
  }

  /**
   * @return the deptname
   */
  public String getDeptname() {
    return deptname;
  }

  /**
   * @param deptname the deptname to set
   */
  public void setDeptname(String deptname) {
    this.deptname = deptname;
  }

}
