package dps_01_build_type.dp03_build.example1;

import dps_01_build_type.dp03_build.example1.builder.Builder;
import dps_01_build_type.dp03_build.example1.concrete_builder.ConcreteBuilder1;
import dps_01_build_type.dp03_build.example1.concrete_builder.ConcreteBuilder2;
import dps_01_build_type.dp03_build.example1.director.Director;
import dps_01_build_type.dp03_build.example1.product.Product;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //导演者角色:
    Director director = new Director();

    //抽象建造者角色:
    Builder b1 = new ConcreteBuilder1();//具体建造者角色:
    Builder b2 = new ConcreteBuilder2();//具体建造者角色:

    director.construct(b1);//建造产品
    //产品角色
    Product p1 = b1.getResult();//返回创建的产品
    p1.show();

    System.out.println();
    director.construct(b2);//建造产品
    //产品角色
    Product p2 = b2.getResult();//返回创建的产品
    p2.show();
  }

}
