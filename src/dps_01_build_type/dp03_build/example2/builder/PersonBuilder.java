package dps_01_build_type.dp03_build.example2.builder;

import dps_01_build_type.dp03_build.example2.product.Person;

/**
 * 抽象建造者角色:这个角色用来规范产品对象的各个组成成分的建造。<br>
 * 一般而言，此角色独立于应用程序的商业逻辑。<br>
 * 人的创建者<br>
 * @author Administrator
 */
public interface PersonBuilder {

  /**
   * 画头
   */
  public void buildHead();

  /**
   * 画身子
   */
  public void buildBody();

  /**
   * 画左手
   */
  public void buildArmLeft();

  /**
   * 画右手
   */
  public void buildArmRight();

  /**
   * 画左腿
   */
  public void buildLegLeft();

  /**
   * 画右腿
   */
  public void buildLegRight();

  /**
   * 返回创建的人<br>
   * @return Person
   */
  public Person createPerson();

}
