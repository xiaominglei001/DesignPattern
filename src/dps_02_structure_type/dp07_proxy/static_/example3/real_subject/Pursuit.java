package dps_02_structure_type.dp07_proxy.static_.example3.real_subject;

import dps_02_structure_type.dp07_proxy.static_.example3.SchoolGirl;
import dps_02_structure_type.dp07_proxy.static_.example3.subject.IGiveGift;

/**
 * ��ʵ��ɫ�������ɫ���������ʵ��������������Ҫ���õĶ���<br>
 * ׷����<br>
 * @author Administrator
 */
public class Pursuit implements IGiveGift {

  /**һ��Ů��*/
  private SchoolGirl mm;

  /**
   * ���캯��<br> 
   * @param mm 
   */
  public Pursuit(SchoolGirl mm) {
    this.mm = mm;
  }

  /**
   * ��������
   */
  public void giveChocolate() {
    System.out.println("��" + mm.getName() + "������");
  }

  /**
   * ���ʻ�
   */
  public void giveDolls() {
    System.out.println("��" + mm.getName() + "�ʻ�");
  }

  /**
   * ���ɿ���
   */
  public void giveFlowers() {
    System.out.println("��" + mm.getName() + "�ɿ���");
  }

}
