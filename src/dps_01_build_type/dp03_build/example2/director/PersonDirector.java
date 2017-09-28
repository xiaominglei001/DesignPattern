package dps_01_build_type.dp03_build.example2.director;

import dps_01_build_type.dp03_build.example2.builder.PersonBuilder;
import dps_01_build_type.dp03_build.example2.product.Person;

/**
 * �����߽�ɫ:<br>
 * ���þ��彨���߽�ɫ�Դ�����Ʒ����ָ���߲�û�в�Ʒ��ľ���֪ʶ��<br>
 * ����ӵ�в�Ʒ��ľ���֪ʶ���Ǿ��彨���߶��� <br>
 * @author Administrator
 *
 */
public class PersonDirector {

  /**�˵Ĵ�����*/
  private PersonBuilder builder;

  /**
   * ���캯��<br>
   * @param builder
   */
  public PersonDirector(PersonBuilder builder) {
    this.builder = builder;
  }

  /**
   * ���ش�������<br>
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
