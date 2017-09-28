package dps_03_action_type.dp09_strategy.example2.context;

import dps_03_action_type.dp09_strategy.example2.concrete_strategy.CashNormal;
import dps_03_action_type.dp09_strategy.example2.concrete_strategy.CashRebate;
import dps_03_action_type.dp09_strategy.example2.concrete_strategy.CashReturn;
import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;

/**
 * 环境角色,客户端调用对象<br>
 * @author Administrator
 */
public class CashContext {

  /**现金收费抽象类*/
  private CashSuper cs;

  /**
   * type表示收费类型,根据类型来决定要实例化哪个策略对象<br>
   * 1:正常收费 2:打折 3:满x返x<br>
   * @param type
   */
  public CashContext(int type) {
    switch (type) {
    case 1:
      //正常收费子类
      cs = new CashNormal();
      break;
    case 2:
      //打折收费子类
      cs = new CashRebate(0.8);
      break;
    case 3:
      //返利收费子类
      cs = new CashReturn(300, 100);
      break;
    default:
      //如果参数不合法,返回正常收费子类
      cs = new CashNormal();
      break;
    }
  }

  /**
   * 获取计算后所需的现金<br>
   * @param money
   * @return double
   */
  public double getResult(double money) {
    if (cs != null) {
      return cs.acceptCash(money);
    }
    return money;
  }

}
