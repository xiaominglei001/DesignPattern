package dps_03_action_type.dp09_strategy.example2.concrete_strategy;

import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;

/**
 * 具体策略角色<br>
 * 打折收费子类<br>
 * @author Administrator
 */
public class CashRebate implements CashSuper {

  /**打折率,如果是8折rebate值为0.8*/
  private double rebate;

  /**
   * 构造函数<br>
   * @param rebate
   */
  public CashRebate(double rebate) {
    this.rebate = rebate;
  }

  /**
   * 打折收费,返回原价*打折率<br>
   * @param money 
   * @return double
   */
  public double acceptCash(double money) {
    return rebate * money;
  }

}
