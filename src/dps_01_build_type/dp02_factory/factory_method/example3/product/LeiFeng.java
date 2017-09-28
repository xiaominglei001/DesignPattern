package dps_01_build_type.dp02_factory.factory_method.example3.product;

/**
 * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。<br>
 * 雷锋<br>
 * @author Administrator
 */
public abstract class LeiFeng {

  /**
   * 扫地
   */
  public void sweep() {
    System.out.print("扫地 ");
  }

  /**
   * 洗衣
   */
  public void wash() {
    System.out.print("洗衣 ");
  }

  /**
   * 买米
   */
  public void buyRice() {
    System.out.print("买米 ");
  }

}
