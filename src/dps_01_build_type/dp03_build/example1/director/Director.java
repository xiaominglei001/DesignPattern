package dps_01_build_type.dp03_build.example1.director;

import dps_01_build_type.dp03_build.example1.builder.Builder;

/**
 * 导演者角色:<br>
 * 调用具体建造者角色以创建产品对象。指导者并没有产品类的具体知识，<br>
 * 真正拥有产品类的具体知识的是具体建造者对象。<br>
 * @author Administrator
 */
public class Director {

  /**
   * 建造产品全过程<br>
   * @param builder
   */
  public void construct(Builder builder) {
    builder.buildPartA();
    builder.buildPartB();
  }

}
