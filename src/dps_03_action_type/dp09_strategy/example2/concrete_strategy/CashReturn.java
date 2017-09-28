package dps_03_action_type.dp09_strategy.example2.concrete_strategy;

import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;
import static java.lang.Math.floor;

/**
 * 具体策略角色<br>
 * 返利收费子类<br>
 * @author Administrator
 */
public class CashReturn implements CashSuper {

  /**返利条件,如返300减100,此值为300*/
  private double condition;

  /**返利值,如返300减100,此值为100*/
  private double mreturn;

  /**
   * 构造函数<br>
   * @param condition
   * @param mreturn
   */
  public CashReturn(double condition, double mreturn) {
    this.condition = condition;
    this.mreturn = mreturn;
  }

  /**
   * 返利收费,返回(原价-应该返回的现金)后的结果<br>
   * @param money 
   * @return double
   */
  public double acceptCash(double money) {
    double result = money;
    if (money >= condition) {
      //数学函数,求一个浮点数的地板,就是求一个最接近它的整数,它的值小于或等于这个浮点数
      result = money - (floor(money / condition)) * mreturn;
    }
    return result;
  }

}
