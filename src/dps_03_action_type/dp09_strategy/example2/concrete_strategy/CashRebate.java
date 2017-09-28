package dps_03_action_type.dp09_strategy.example2.concrete_strategy;

import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;

/**
 * ������Խ�ɫ<br>
 * �����շ�����<br>
 * @author Administrator
 */
public class CashRebate implements CashSuper {

  /**������,�����8��rebateֵΪ0.8*/
  private double rebate;

  /**
   * ���캯��<br>
   * @param rebate
   */
  public CashRebate(double rebate) {
    this.rebate = rebate;
  }

  /**
   * �����շ�,����ԭ��*������<br>
   * @param money 
   * @return double
   */
  public double acceptCash(double money) {
    return rebate * money;
  }

}
