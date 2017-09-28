package dps_03_action_type.dp01_chain_of_responsibility.example3;

/**
 * ������������ģʽ�Ľ�ɫ:��������������<br>
 * @author Administrator
 */
public class Request {

  /**���������*/
  private String type;
  /**���������*/
  private String content;
  /**���������*/
  private int number;

  /**
   * ���캯��<br>
   */
  public Request() {
  }

  /**
   * ���캯��<br>
   * @param type
   * @param content
   * @param number
   */
  public Request(String type, String content, int number) {
    this.type = type;
    this.content = content;
    this.number = number;
  }

  /**
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * @param content the content to set
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * @return the number
   */
  public int getNumber() {
    return number;
  }

  /**
   * @param number the number to set
   */
  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

}
