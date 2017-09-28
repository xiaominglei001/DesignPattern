package dps_02_structure_type.dp07_proxy.static_.example3;

import dps_02_structure_type.dp07_proxy.static_.example3.proxy.Proxy;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SchoolGirl jiaojiao = new SchoolGirl("娇娇");

    //代理类
    Proxy daili = new Proxy(jiaojiao);
    daili.giveDolls();//送洋娃娃 
    daili.giveFlowers();//送鲜花 
    daili.giveChocolate();//送巧克力
  }

}
