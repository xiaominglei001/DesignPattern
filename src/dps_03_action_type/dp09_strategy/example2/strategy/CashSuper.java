package dps_03_action_type.dp09_strategy.example2.strategy;

/**
 * 抽象策略角色<br>
 * 现金收费抽象类<br>
 * @author Administrator
 */
public interface CashSuper {

  /**
   * 计算所需现金,参数为原价,返回当前价<br>
   * @param money
   * @return double
   */
  public double acceptCash(double money);

}
