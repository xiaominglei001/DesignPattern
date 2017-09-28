package dps_03_action_type.dp01_chain_of_responsibility.example3;

/**
 * 不属于责任链模式的角色:用来封闭请求的类<br>
 * @author Administrator
 */
public class Request {

  /**申请的类型*/
  private String type;
  /**申请的内容*/
  private String content;
  /**申请的数量*/
  private int number;

  /**
   * 构造函数<br>
   */
  public Request() {
  }

  /**
   * 构造函数<br>
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
