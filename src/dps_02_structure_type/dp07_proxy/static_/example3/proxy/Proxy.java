package dps_02_structure_type.dp07_proxy.static_.example3.proxy;

import dps_02_structure_type.dp07_proxy.static_.example3.SchoolGirl;
import dps_02_structure_type.dp07_proxy.static_.example3.real_subject.Pursuit;
import dps_02_structure_type.dp07_proxy.static_.example3.subject.IGiveGift;

/**
 * �����ɫ����������ɫ�ڲ����ж���ʵ��������ã��Ӷ����Բ�����ʵ����<br>
 * ͬʱ��������ṩ����ʵ������ͬ�Ľӿ��Ա����κ�ʱ�̶��ܴ�����ʵ����<br>
 * ͬʱ��������������ִ����ʵ�������ʱ�����������Ĳ������൱�ڶ���ʵ������з�װ��<br>
 * ������<br>
 * @author Administrator
 */
public class Proxy implements IGiveGift {

  /**׷����*/
  private Pursuit gg;

  /**
   * ���캯��<br> 
   * @param mm 
   */
  public Proxy(SchoolGirl mm) {
    gg = new Pursuit(mm);
  }

  /**
   * ���ɿ��� 
   */
  public void giveChocolate() {
    gg.giveChocolate();
  }

  /**
   * ��������
   */
  public void giveDolls() {
    gg.giveDolls();
  }

  /**
   * ���ʻ� 
   */
  public void giveFlowers() {
    gg.giveFlowers();
  }

}
