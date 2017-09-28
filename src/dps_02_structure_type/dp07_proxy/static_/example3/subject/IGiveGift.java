package dps_02_structure_type.dp07_proxy.static_.example3.subject;

/**
 * 抽象角色：声明真实对象和代理对象的共同接口；<br>
 * 定义追求妹妹的三个抽象方法<br>
 * @author Administrator
 */
public interface IGiveGift {

  /**
   * 送洋娃娃
   */
  public void giveDolls();

  /**
   * 送鲜花
   */
  public void giveFlowers();

  /**
   * 送巧克力
   */
  public void giveChocolate();

}
