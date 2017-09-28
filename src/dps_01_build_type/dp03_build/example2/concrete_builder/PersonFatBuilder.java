package dps_01_build_type.dp03_build.example2.concrete_builder;

import dps_01_build_type.dp03_build.example2.builder.PersonBuilder;
import dps_01_build_type.dp03_build.example2.product.Person;

/**
 * 具体建造者角色:<br>
 * 担任这个角色的是于应用程序紧密相关的类，它们在指导者的调用下创建产品实例。<br>
 * 这个角色在实现抽象建造者角色提供的方法的前提下，达到完成产品组装，提供成品的功能。<br>
 * 胖人创建者<br>
 * @author Administrator
 *
 */
public class PersonFatBuilder implements PersonBuilder {

  /**
   * 画头
   */
  public void buildHead() {
    System.out.print("画胖头 ");
  }

  /**
   * 画身子
   */
  public void buildBody() {
    System.out.print("画胖身子 ");
  }

  /**
   * 画左手
   */
  public void buildArmLeft() {
    System.out.print("画粗左手 ");
  }

  /**
   * 画右手
   */
  public void buildArmRight() {
    System.out.print("画粗右手 ");
  }

  /**
   * 画左腿
   */
  public void buildLegLeft() {
    System.out.print("画粗左腿 ");
  }

  /**
   * 画右腿
   */
  public void buildLegRight() {
    System.out.print("画粗右腿 ");
  }

  /**
   * 返回创建的人<br>
   * @return Person
   */
  public Person createPerson() {
    return new Person();
  }

}
