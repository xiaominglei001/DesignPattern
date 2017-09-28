package dps_01_build_type.dp04_prototype.shallow.example2;

/**
 * 不属于原型模式的角色:工作经历<br>
 * @author Administrator
 */
public class WorkExperience {

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

}
