package dps_03_action_type.dp10_template_method.example2.concrete_class;

import dps_03_action_type.dp10_template_method.example2.abstract_class.TestPaper;

/**
 * ����ģ�棨ConcreteClass����ɫ�����µ����Σ�<br>
 * ʵ�ָ����������һ���������󷽷���������һ�������߼�����ɲ��衣<br>
 * ÿһ������ģ���ɫ������������������ģ���ɫ��֮��Ӧ����ÿһ������ģ���ɫ�����Ը�����Щ���󷽷�<br>
 * ��Ҳ���Ƕ����߼�����ɲ��裩�Ĳ�ͬʵ�֣��Ӷ�ʹ�ö����߼���ʵ�ָ�����ͬ��<br>
 * �����B<br>
 * @author Administrator
 */
public class TestPaperB extends TestPaper {

  /**
   * ��1���
   * @return String
   */
  public String answer1() {
    return "c";
  }

  /**
   * ��2���
   * @return String
   */
  public String answer2() {
    return "a";
  }

  /**
   * ��3���
   * @return String
   */
  public String answer3() {
    return "a";
  }

}
