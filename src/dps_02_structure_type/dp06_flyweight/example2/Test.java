package dps_02_structure_type.dp06_flyweight.example2;

import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;
import dps_02_structure_type.dp06_flyweight.example2.flyweight_factory.Storage;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //��Ԫ����(FlyweightFactory)��ɫ:�˵Ĵ�����
    Storage s = new Storage();

    //������Ԫ(Flyweight)��ɫ:ʳ��
    AbsFood food1 = s.getFood("ũ��С��");
    AbsFood food2 = s.getFood("ũ��С��");
    AbsFood food3 = s.getFood("���Ե���");

    //�����н�����Կ���food1��food2����ͬ�Ķ���
    food1.display();
    food2.display();
    food3.display();
  }

}
