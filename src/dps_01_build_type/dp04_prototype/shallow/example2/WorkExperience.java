package dps_01_build_type.dp04_prototype.shallow.example2;

/**
 * ������ԭ��ģʽ�Ľ�ɫ:��������<br>
 * @author Administrator
 */
public class WorkExperience {

  /**��������,��:2006-2008*/
  private String workDate;
  /**���ڵĹ�˾,��:XX�Ƽ�*/
  private String company;

  /**
   * ���캯��<br>
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
