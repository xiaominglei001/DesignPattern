package dps_02_structure_type.dp02_bridge.example3;

import dps_02_structure_type.dp02_bridge.example3.abstraction.HandsetBrand;
import dps_02_structure_type.dp02_bridge.example3.concrete_implementor.HandsetAddressList;
import dps_02_structure_type.dp02_bridge.example3.concrete_implementor.HandsetGame;
import dps_02_structure_type.dp02_bridge.example3.concrete_implementor.HandsetMP3;
import dps_02_structure_type.dp02_bridge.example3.refined_abstraction.HandsetBrandM;
import dps_02_structure_type.dp02_bridge.example3.refined_abstraction.HandsetBrandN;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //���󻯽�ɫ(Abstraction)���ֻ�Ʒ��M,N
    HandsetBrand m = new HandsetBrandM();
    HandsetBrand n = new HandsetBrandN();

    //MƷ���ֻ���������Ϸ
    m.setHandsetSoft(new HandsetGame());
    m.run();

    //MƷ���ֻ�������ͨѶ¼
    m.setHandsetSoft(new HandsetAddressList());
    m.run();

    //MƷ���ֻ�������MP3����
    m.setHandsetSoft(new HandsetMP3());
    m.run();


    //NƷ���ֻ���������Ϸ
    n.setHandsetSoft(new HandsetGame());
    n.run();

    //NƷ���ֻ�������ͨѶ¼
    n.setHandsetSoft(new HandsetAddressList());
    n.run();

    //NƷ���ֻ�������MP3����
    n.setHandsetSoft(new HandsetMP3());
    n.run();
  }

}
