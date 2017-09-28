package dps_01_build_type.dp03_build.example2.director;

import dps_01_build_type.dp03_build.example2.builder.PersonBuilder;
import dps_01_build_type.dp03_build.example2.product.Person;

/**
 * 导演者角色:<br>
 * 调用具体建造者角色以创建产品对象。指导者并没有产品类的具体知识，<br>
 * 真正拥有产品类的具体知识的是具体建造者对象。 <br>
 * @author Administrator
 *
 */
public class PersonDirector {

  /**人的创建者*/
  private PersonBuilder builder;

  /**
   * 构造函数<br>
   * @param builder
   */
  public PersonDirector(PersonBuilder builder) {
    this.builder = builder;
  }

  /**
   * 返回创建的人<br>
   * @return Person
   */
  public Person createPerson() {
    builder.buildHead();
    builder.buildBody();
    builder.buildArmLeft();
    builder.buildArmRight();
    builder.buildLegLeft();
    builder.buildLegRight();
    return builder.createPerson();
  }

}
