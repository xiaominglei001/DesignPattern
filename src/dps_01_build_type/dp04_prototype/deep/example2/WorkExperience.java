package dps_01_build_type.dp04_prototype.deep.example2;

/**
 * 不属于原型模式的角色:工作经历<br>
 * @author Administrator
 */
public class WorkExperience implements Cloneable {

  /**工作日期,如:2006-2008*/
  private String workDate;
  /**所在的公司,如:XX科技*/
  private String company;

  /**
   * 构造函数<br>
   * @param workDate
   * @param company
   */
  public WorkExperience(String workDate, String company) {
    this.workDate = workDate;
    this.company = company;
  }

  /**
   * @return the company
   */
  public String getCompany() {
    return company;
  }

  /**
   * @param company the company to set
   */
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * @return the workDate
   */
  public String getWorkDate() {
    return workDate;
  }

  /**
   * @param workDate the workDate to set
   */
  public void setWorkDate(String workDate) {
    this.workDate = workDate;
  }

  /**
   * 定义克隆方法<br>
   * @return Computer
   * @throws CloneNotSupportedException 
   */
  public WorkExperience clone() throws CloneNotSupportedException {
    //WorkExperience内部String为不变类型,所以这里浅克隆即可
    return (WorkExperience) super.clone();
  }

}
