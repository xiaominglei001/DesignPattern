package dps_02_structure_type.dp07_proxy.static_.example3.real_subject;

import dps_02_structure_type.dp07_proxy.static_.example3.SchoolGirl;
import dps_02_structure_type.dp07_proxy.static_.example3.subject.IGiveGift;

/**
 * 真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。<br>
 * 追求者<br>
 * @author Administrator
 */
public class Pursuit implements IGiveGift {

  /**一个女生*/
  private SchoolGirl mm;

  /**
   * 构造函数<br> 
   * @param mm 
   */
  public Pursuit(SchoolGirl mm) {
    this.mm = mm;
  }

  /**
   * 送洋娃娃
   */
  public void giveChocolate() {
    System.out.println("送" + mm.getName() + "洋娃娃");
  }

  /**
   * 送鲜花
   */
  public void giveDolls() {
    System.out.println("送" + mm.getName() + "鲜花");
  }

  /**
   * 送巧克力
   */
  public void giveFlowers() {
    System.out.println("送" + mm.getName() + "巧克力");
  }

}
