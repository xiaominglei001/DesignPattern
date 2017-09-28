package dps_03_action_type.dp03_interpreter.example1.context;

/**
 * Context：上下文，包含解释器需要解释的全局信息。<br>
 * @author Administrator
 */
public class Context {

  /**输入的字符串*/
  private String input;
  /**输出的字符串*/
  private int output;

  /**
   * @return the input
   */
  public String getInput() {
    return input;
  }

  /**
   * @param input the input to set
   */
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * @return the output
   */
  public int getOutput() {
    return output;
  }

  /**
   * @param output the output to set
   */
  public void setOutput(int output) {
    this.output = output;
  }

}
