package dps_01_build_type.dp03_build.example1.concrete_builder;

import dps_01_build_type.dp03_build.example1.builder.Builder;
import dps_01_build_type.dp03_build.example1.product.Product;

/**
 * 具体建造者角色:<br>
 * 担任这个角色的是于应用程序紧密相关的类，它们在指导者的调用下创建产品实例。<br>
 * 这个角色在实现抽象建造者角色提供的方法的前提下，达到完成产品组装，提供成品的功能。<br>
 * @author Administrator
 */
public class ConcreteBuilder1 implements Builder {

  /**产品角色*/
  private Product product = new Product();

  /**
   * 建造部件A
   */
  public void buildPartA() {
    product.add("部件A");
  }

  /**
   * 建造部件B
   */
  public void buildPartB() {
    product.add("部件B");
  }

  /**
   * 返回创建的产品<br>
   * @return Person
   */
  public Product getResult() {
    return product;
  }

}
