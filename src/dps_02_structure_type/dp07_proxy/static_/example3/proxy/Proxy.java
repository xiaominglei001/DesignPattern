package dps_02_structure_type.dp07_proxy.static_.example3.proxy;

import dps_02_structure_type.dp07_proxy.static_.example3.SchoolGirl;
import dps_02_structure_type.dp07_proxy.static_.example3.real_subject.Pursuit;
import dps_02_structure_type.dp07_proxy.static_.example3.subject.IGiveGift;

/**
 * 代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，<br>
 * 同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。<br>
 * 同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。<br>
 * 代理类<br>
 * @author Administrator
 */
public class Proxy implements IGiveGift {

  /**追求者*/
  private Pursuit gg;

  /**
   * 构造函数<br> 
   * @param mm 
   */
  public Proxy(SchoolGirl mm) {
    gg = new Pursuit(mm);
  }

  /**
   * 送巧克力 
   */
  public void giveChocolate() {
    gg.giveChocolate();
  }

  /**
   * 送洋娃娃
   */
  public void giveDolls() {
    gg.giveDolls();
  }

  /**
   * 送鲜花 
   */
  public void giveFlowers() {
    gg.giveFlowers();
  }

}
