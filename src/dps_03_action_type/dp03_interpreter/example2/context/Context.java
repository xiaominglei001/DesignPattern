package dps_03_action_type.dp03_interpreter.example2.context;

/**
 * Context：上下文，包含解释器需要解释的全局信息。<br>
 * @author Administrator
 */
public class Context {

  /**汉字表示的数字*/
  private String statement;
  /**阿拉伯数字*/
  private int data;

  /**
   * 构造函数:接受一个汉字表达式数字<br>
   * @param statement
   */
  public Context(String statement) {
    this.statement = statement;
  }

  /**
   * @return the data
   */
  public int getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(int data) {
    this.data = data;
  }

  /**
   * @return the statement
   */
  public String getStatement() {
    return statement;
  }

  /**
   * @param statement the statement to set
   */
  public void setStatement(String statement) {
    this.statement = statement;
  }

}
