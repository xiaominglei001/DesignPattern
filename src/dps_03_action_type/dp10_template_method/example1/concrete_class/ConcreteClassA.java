package dps_03_action_type.dp10_template_method.example1.concrete_class;

import dps_03_action_type.dp10_template_method.example1.abstract_class.AbstractClass;

/**
 * ����ģ�棨ConcreteClass����ɫ�����µ����Σ�<br>
 * ʵ�ָ����������һ���������󷽷���������һ�������߼�����ɲ��衣<br>
 * ÿһ������ģ���ɫ������������������ģ���ɫ��֮��Ӧ����ÿһ������ģ���ɫ�����Ը�����Щ���󷽷�<br>
 * ��Ҳ���Ƕ����߼�����ɲ��裩�Ĳ�ͬʵ�֣��Ӷ�ʹ�ö����߼���ʵ�ָ�����ͬ��<br>
 * @author Administrator
 */
public class ConcreteClassA extends AbstractClass {

  /**
   * ������Ϊ1
   */
  public void primitiveOperation1() {
    System.out.println("����ģ��Aʵ����Ϊ1.");
  }

  /**
   * ������Ϊ1
   */
  public void primitiveOperation2() {
    System.out.println("����ģ��Aʵ����Ϊ2.");
  }

}
