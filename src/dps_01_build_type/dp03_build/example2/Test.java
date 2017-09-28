package dps_01_build_type.dp03_build.example2;

import dps_01_build_type.dp03_build.example2.builder.PersonBuilder;
import dps_01_build_type.dp03_build.example2.concrete_builder.PersonFatBuilder;
import dps_01_build_type.dp03_build.example2.concrete_builder.PersonThinBuilder;
import dps_01_build_type.dp03_build.example2.director.PersonDirector;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象建造者角色:人的创建者
    PersonBuilder thinBuilder = new PersonThinBuilder();
    PersonBuilder fatBuilder = new PersonFatBuilder();

    //导演者角色
    PersonDirector director1 = new PersonDirector(thinBuilder);
    PersonDirector director2 = new PersonDirector(fatBuilder);

    //创建人
    director1.createPerson();
    System.out.println();
    director2.createPerson();
  }

}
