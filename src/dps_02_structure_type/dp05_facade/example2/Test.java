package dps_02_structure_type.dp05_facade.example2;

import dps_02_structure_type.dp05_facade.example2.facade.Fund;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����ɫ:����
    Fund fund = new Fund();
    fund.buyFund();//������
    System.out.println();
    fund.sellFund();//�������
  }

}
