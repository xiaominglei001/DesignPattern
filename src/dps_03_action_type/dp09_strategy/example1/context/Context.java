package dps_03_action_type.dp09_strategy.example1.context;

import dps_03_action_type.dp09_strategy.example1.strategy.Strategy;

/**
 * ������ɫ,�ͻ��˵��ö���<br>
 * @author Administrator
 */
public class Context {

  /**�����㷨*/
  private Strategy strategy;

  /**
   * ���캯��<br>
   * @param strategy
   */
  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  /**
   * �����Ľӿ�
   */
  public void contextInterface() {
    strategy.algorithmInterface();
  }

}
