package dps_03_action_type.dp09_strategy.example2.concrete_strategy;

import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;

/**
 * ������Խ�ɫ<br>
 * �����շ�����<br>
 * @author Administrator
 */
public class CashNormal implements CashSuper {

  /**
   * �����շ�,����ԭ��<br>
   * @param money 
   * @return double
   */
  public double acceptCash(double money) {
    return money;
  }

}
