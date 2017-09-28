package dps_01_build_type.dp03_build.example2.concrete_builder;

import dps_01_build_type.dp03_build.example2.builder.PersonBuilder;
import dps_01_build_type.dp03_build.example2.product.Person;

/**
 * ���彨���߽�ɫ:<br>
 * ���������ɫ������Ӧ�ó��������ص��࣬������ָ���ߵĵ����´�����Ʒʵ����<br>
 * �����ɫ��ʵ�ֳ������߽�ɫ�ṩ�ķ�����ǰ���£��ﵽ��ɲ�Ʒ��װ���ṩ��Ʒ�Ĺ��ܡ�<br>
 * ���˴�����<br>
 * @author Administrator
 *
 */
public class PersonThinBuilder implements PersonBuilder {

  /**
   * ��ͷ
   */
  public void buildHead() {
    System.out.print("��Сͷ ");
  }

  /**
   * ������
   */
  public void buildBody() {
    System.out.print("��С���� ");
  }

  /**
   * ������
   */
  public void buildArmLeft() {
    System.out.print("��ϸ���� ");
  }

  /**
   * ������
   */
  public void buildArmRight() {
    System.out.print("��ϸ���� ");
  }

  /**
   * ������
   */
  public void buildLegLeft() {
    System.out.print("��ϸ���� ");
  }

  /**
   * ������
   */
  public void buildLegRight() {
    System.out.print("��ϸ���� ");
  }

  /**
   * ���ش�������<br>
   * @return Person
   */
  public Person createPerson() {
    return new Person();
  }

}
