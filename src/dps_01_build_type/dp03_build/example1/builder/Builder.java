package dps_01_build_type.dp03_build.example1.builder;

import dps_01_build_type.dp03_build.example1.product.Product;

/**
 * 抽象建造者角色:这个角色用来规范产品对象的各个组成成分的建造。<br>
 * 一般而言，此角色独立于应用程序的商业逻辑。<br>
 * @author Administrator
 */
public interface Builder {

  /**
   * 建造部件A
   */
  public void buildPartA();

  /**
   * 建造部件B
   */
  public void buildPartB();

  /**
   * 返回创建的产品<br>
   * @return Person
   */
  public Product getResult();

}
