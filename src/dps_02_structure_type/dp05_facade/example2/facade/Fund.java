package dps_02_structure_type.dp05_facade.example2.facade;

import dps_02_structure_type.dp05_facade.example2.subsystem.NationalDebt1;
import dps_02_structure_type.dp05_facade.example2.subsystem.Realty1;
import dps_02_structure_type.dp05_facade.example2.subsystem.Stock1;
import dps_02_structure_type.dp05_facade.example2.subsystem.Stock2;
import dps_02_structure_type.dp05_facade.example2.subsystem.Stock3;

/**
 * �����ɫ:����<br>
 * @author Administrator
 */
public class Fund {

  /**��Ʊ1*/
  private Stock1 gu1;
  /**��Ʊ2*/
  private Stock2 gu2;
  /**��Ʊ3*/
  private Stock3 gu3;
  /**��ծ1*/
  private NationalDebt1 nd1;
  /**���ز�1*/
  private Realty1 rt1;

  /**
   * ���캯��
   */
  public Fund() {
    gu1 = new Stock1();
    gu2 = new Stock2();
    gu3 = new Stock3();
    nd1 = new NationalDebt1();
    rt1 = new Realty1();
  }

  /**
   * ������
   */
  public void buyFund() {
    gu1.buy();
    gu2.buy();
    gu3.buy();
    nd1.buy();
    rt1.buy();
  }

  /**
   * �������
   */
  public void sellFund() {
    gu1.sell();
    gu2.sell();
    gu3.sell();
    nd1.sell();
    rt1.sell();
  }

}
