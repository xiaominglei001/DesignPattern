package dps_03_action_type.dp11_visitor.example3.concrete_visitor;

import dps_03_action_type.dp11_visitor.example3.concrete_element.Chrysanthemum;
import dps_03_action_type.dp11_visitor.example3.concrete_element.Peony;
import dps_03_action_type.dp11_visitor.example3.visitor.Deflower;

/**
 * ��������߽�ɫ��Concrete Visitor����ʵ��ÿ���ɷ����߽�ɫ��Visitor�������Ĳ�����<br>
 * �˹��ڻ�����<br>
 * @author Administrator
 */
public class Manpower implements Deflower {

  /**
   * ����ջ��Ļ���<br>
   * @param element 
   */
  public void processChrysanthemumDust(@SuppressWarnings("unused")
  Chrysanthemum element) {
    System.out.println(getClass().getSimpleName() + "���ڲɼ��ջ�.");
  }

  /**
   * ����ĵ�����Ļ���<br>
   * @param element 
   */
  public void processPeonyDust(@SuppressWarnings("unused")
  Peony element) {
    System.out.println(getClass().getSimpleName() + "���ڲɼ�ĵ����.");
  }

}
