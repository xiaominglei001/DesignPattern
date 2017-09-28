package dps_03_action_type.dp09_strategy.example2.concrete_strategy;

import dps_03_action_type.dp09_strategy.example2.strategy.CashSuper;
import static java.lang.Math.floor;

/**
 * ������Խ�ɫ<br>
 * �����շ�����<br>
 * @author Administrator
 */
public class CashReturn implements CashSuper {

  /**��������,�緵300��100,��ֵΪ300*/
  private double condition;

  /**����ֵ,�緵300��100,��ֵΪ100*/
  private double mreturn;

  /**
   * ���캯��<br>
   * @param condition
   * @param mreturn
   */
  public CashReturn(double condition, double mreturn) {
    this.condition = condition;
    this.mreturn = mreturn;
  }

  /**
   * �����շ�,����(ԭ��-Ӧ�÷��ص��ֽ�)��Ľ��<br>
   * @param money 
   * @return double
   */
  public double acceptCash(double money) {
    double result = money;
    if (money >= condition) {
      //��ѧ����,��һ���������ĵذ�,������һ����ӽ���������,����ֵС�ڻ�������������
      result = money - (floor(money / condition)) * mreturn;
    }
    return result;
  }

}
