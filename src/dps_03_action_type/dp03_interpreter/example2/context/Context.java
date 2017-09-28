package dps_03_action_type.dp03_interpreter.example2.context;

/**
 * Context�������ģ�������������Ҫ���͵�ȫ����Ϣ��<br>
 * @author Administrator
 */
public class Context {

  /**���ֱ�ʾ������*/
  private String statement;
  /**����������*/
  private int data;

  /**
   * ���캯��:����һ�����ֱ��ʽ����<br>
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
