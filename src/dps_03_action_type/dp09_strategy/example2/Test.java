package dps_03_action_type.dp09_strategy.example2;

import dps_03_action_type.dp09_strategy.example2.context.CashContext;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //������ɫ,�ͻ��˵��ö���,����(1:�����շ� 2:���� 3:��x��x)
    CashContext context = new CashContext(3);
    double unitPrice = 301;//����
    double amount = 1;//����
    double totalPrice = context.getResult(unitPrice * amount);//�������ܼ�Ǯ
    System.out.println("��һ����Ҫ֧�� " + totalPrice + " Ԫ");
  }

}
