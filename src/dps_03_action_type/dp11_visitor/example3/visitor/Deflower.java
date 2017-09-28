package dps_03_action_type.dp11_visitor.example3.visitor;

import dps_03_action_type.dp11_visitor.example3.concrete_element.Chrysanthemum;
import dps_03_action_type.dp11_visitor.example3.concrete_element.Peony;

/**
 * �����߽�ɫ��Visitor����Ϊ�ö���ṹ�о���Ԫ�ؽ�ɫ����һ�����ʲ����ӿڡ�<br>
 * �ò����ӿڵ����ֺͲ�����ʶ�˷��ͷ����������������ߵľ���Ԫ�ؽ�ɫ��<br>
 * ���������߾Ϳ���ͨ����Ԫ�ؽ�ɫ���ض��ӿ�ֱ�ӷ�������<br>
 * ����ɻ���<br>
 * @author Administrator
 */
public interface Deflower {

  /**
   * ����ջ��Ļ���<br>
   * @param element 
   */
  public void processChrysanthemumDust(Chrysanthemum element);

  /**
   * ����ĵ�����Ļ���<br>
   * @param element 
   */
  public void processPeonyDust(Peony element);

}
