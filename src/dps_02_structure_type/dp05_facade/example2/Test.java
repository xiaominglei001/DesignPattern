package dps_02_structure_type.dp05_facade.example2;

import dps_02_structure_type.dp05_facade.example2.facade.Fund;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //门面角色:基金
    Fund fund = new Fund();
    fund.buyFund();//基金购入
    System.out.println();
    fund.sellFund();//基金赎回
  }

}
