package dps_03_action_type.dp09_strategy.example2.concrete_strategy;

import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;

/**
 * 具体策略角色<br>
 * 正常收费子类<br>
 * @author Administrator
 */
public class CashNormal implements CashSuper {

  /**
   * 正常收费,返回原价<br>
   * @param money 
   * @return double
   */
  public double acceptCash(double money) {
    return money;
  }

}
