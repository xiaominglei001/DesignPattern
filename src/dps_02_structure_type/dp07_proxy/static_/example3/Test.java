package dps_02_structure_type.dp07_proxy.static_.example3;

import dps_02_structure_type.dp07_proxy.static_.example3.proxy.Proxy;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SchoolGirl jiaojiao = new SchoolGirl("����");

    //������
    Proxy daili = new Proxy(jiaojiao);
    daili.giveDolls();//�������� 
    daili.giveFlowers();//���ʻ� 
    daili.giveChocolate();//���ɿ���
  }

}
