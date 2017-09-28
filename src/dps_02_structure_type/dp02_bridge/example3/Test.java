package dps_02_structure_type.dp02_bridge.example3;

import dps_02_structure_type.dp02_bridge.example3.abstraction.HandsetBrand;
import dps_02_structure_type.dp02_bridge.example3.concrete_implementor.HandsetAddressList;
import dps_02_structure_type.dp02_bridge.example3.concrete_implementor.HandsetGame;
import dps_02_structure_type.dp02_bridge.example3.concrete_implementor.HandsetMP3;
import dps_02_structure_type.dp02_bridge.example3.refined_abstraction.HandsetBrandM;
import dps_02_structure_type.dp02_bridge.example3.refined_abstraction.HandsetBrandN;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象化角色(Abstraction)：手机品牌M,N
    HandsetBrand m = new HandsetBrandM();
    HandsetBrand n = new HandsetBrandN();

    //M品牌手机上运行游戏
    m.setHandsetSoft(new HandsetGame());
    m.run();

    //M品牌手机上运行通讯录
    m.setHandsetSoft(new HandsetAddressList());
    m.run();

    //M品牌手机上运行MP3播放
    m.setHandsetSoft(new HandsetMP3());
    m.run();


    //N品牌手机上运行游戏
    n.setHandsetSoft(new HandsetGame());
    n.run();

    //N品牌手机上运行通讯录
    n.setHandsetSoft(new HandsetAddressList());
    n.run();

    //N品牌手机上运行MP3播放
    n.setHandsetSoft(new HandsetMP3());
    n.run();
  }

}
