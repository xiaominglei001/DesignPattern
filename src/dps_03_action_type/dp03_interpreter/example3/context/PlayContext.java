package dps_03_action_type.dp03_interpreter.example3.context;

/**
 * Context：上下文，包含解释器需要解释的全局信息。<br>
 * 演奏内容<br>
 * @author Administrator
 */
public class PlayContext {

  /**演奏文本*/
  private String playText;

  /**
   * @return the playText
   */
  public String getPlayText() {
    return playText;
  }

  /**
   * @param playText the playText to set
   */
  public void setPlayText(String playText) {
    this.playText = playText;
  }

}
