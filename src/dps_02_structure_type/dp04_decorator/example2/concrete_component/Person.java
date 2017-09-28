package dps_02_structure_type.dp04_decorator.example2.concrete_component;

import dps_02_structure_type.dp04_decorator.example2.component.IPerson;

/**
 * ���幹����Concrete Component����ɫ������һ����Ҫ���ո������ε��ࡣ<br>
 * ��<br>
 * @author Administrator
 */
public class Person implements IPerson {

  /**����*/
  private String name;

  /**
   * ���캯��<br>
   * @param name
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * չʾ�Լ�
   */
  public void show() {
    System.out.println("װ���" + name);
  }

}
