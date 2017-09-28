package dps_02_structure_type.dp05_facade.example2.facade;

import dps_02_structure_type.dp05_facade.example2.subsystem.NationalDebt1;
import dps_02_structure_type.dp05_facade.example2.subsystem.Realty1;
import dps_02_structure_type.dp05_facade.example2.subsystem.Stock1;
import dps_02_structure_type.dp05_facade.example2.subsystem.Stock2;
import dps_02_structure_type.dp05_facade.example2.subsystem.Stock3;

/**
 * 门面角色:基金<br>
 * @author Administrator
 */
public class Fund {

  /**股票1*/
  private Stock1 gu1;
  /**股票2*/
  private Stock2 gu2;
  /**股票3*/
  private Stock3 gu3;
  /**国债1*/
  private NationalDebt1 nd1;
  /**房地产1*/
  private Realty1 rt1;

  /**
   * 构造函数
   */
  public Fund() {
    gu1 = new Stock1();
    gu2 = new Stock2();
    gu3 = new Stock3();
    nd1 = new NationalDebt1();
    rt1 = new Realty1();
  }

  /**
   * 基金购入
   */
  public void buyFund() {
    gu1.buy();
    gu2.buy();
    gu3.buy();
    nd1.buy();
    rt1.buy();
  }

  /**
   * 基金赎回
   */
  public void sellFund() {
    gu1.sell();
    gu2.sell();
    gu3.sell();
    nd1.sell();
    rt1.sell();
  }

}
