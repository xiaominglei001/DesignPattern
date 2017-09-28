package dps_03_action_type.dp09_strategy.example2.context;

import dps_03_action_type.dp09_strategy.example2.concrete_strategy.CashNormal;
import dps_03_action_type.dp09_strategy.example2.concrete_strategy.CashRebate;
import dps_03_action_type.dp09_strategy.example2.concrete_strategy.CashReturn;
import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;

/**
 * ������ɫ,�ͻ��˵��ö���<br>
 * @author Administrator
 */
public class CashContext {

  /**�ֽ��շѳ�����*/
  private CashSuper cs;

  /**
   * type��ʾ�շ�����,��������������Ҫʵ�����ĸ����Զ���<br>
   * 1:�����շ� 2:���� 3:��x��x<br>
   * @param type
   */
  public CashContext(int type) {
    switch (type) {
    case 1:
      //�����շ�����
      cs = new CashNormal();
      break;
    case 2:
      //�����շ�����
      cs = new CashRebate(0.8);
      break;
    case 3:
      //�����շ�����
      cs = new CashReturn(300, 100);
      break;
    default:
      //����������Ϸ�,���������շ�����
      cs = new CashNormal();
      break;
    }
  }

  /**
   * ��ȡ�����������ֽ�<br>
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
