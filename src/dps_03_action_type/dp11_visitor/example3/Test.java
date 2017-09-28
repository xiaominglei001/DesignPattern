package dps_03_action_type.dp11_visitor.example3;

import dps_03_action_type.dp11_visitor.example3.concrete_element.Chrysanthemum;
import dps_03_action_type.dp11_visitor.example3.concrete_element.Peony;
import dps_03_action_type.dp11_visitor.example3.concrete_visitor.Bee;
import dps_03_action_type.dp11_visitor.example3.concrete_visitor.Butterfly;
import dps_03_action_type.dp11_visitor.example3.concrete_visitor.Manpower;
import dps_03_action_type.dp11_visitor.example3.object_structure.Farm;

/**
 * ������:����ɻ��Ķ����к���,�۷�,�˹������ڻ��ȵ�,�����кܶ���,����ֻ�����ֲ����Ժ󲻻���������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����ṹ��ɫ:ũ��
    Farm f = new Farm();
    f.attach(new Chrysanthemum());
    f.attach(new Peony());

    //��������߽�ɫ:�۷�,����,�˹��ڻ�
    Bee v1 = new Bee();
    Butterfly v2 = new Butterfly();
    Manpower v3 = new Manpower();

    //����Ԫ��,�����ܷ����߿�ʼ��ֳ
    f.breed(v1);
    f.breed(v2);
    f.breed(v3);
  }

}
