package dps_02_structure_type.dp01_adapter.object.example3;

import dps_02_structure_type.dp01_adapter.object.example3.adaptee.Forwards;
import dps_02_structure_type.dp01_adapter.object.example3.adaptee.Guards;
import dps_02_structure_type.dp01_adapter.object.example3.adapter.Translator;
import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Ŀ�꣨Target����ɫ:��Ա,����ʵ��Ŀ��ӿڵ���
    Player b = new Forwards("�͵ٶ�");
    b.attack();//����
    b.defense();//����

    //Ŀ�꣨Target����ɫ:��Ա,����ʵ��Ŀ��ӿڵ���
    Player m = new Guards("��˶��׵�");
    m.attack();//����
    m.defense();//����

    //Ŀ�꣨Target����ɫ:��Ա,�������ʵ��Ŀ��ӿڵ���
    Player y = new Translator("Ҧ��");
    y.attack();//����
    y.defense();//����
  }

}
