package dps_02_structure_type.dp06_flyweight.example2;

import dps_02_structure_type.dp06_flyweight.example2.concrete_flyweight.Food;
import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;

/**
 * ��������Ԫģʽ�Ľ�ɫ,����ֻ���������˵�һ����ʦ<br>
 * @author Administrator
 */
public class Kitchener {

  /**
   * ���˵Ĺ���<br>
   * @param name
   * @return AbsFood
   */
  public AbsFood cook(String name) {
    return new Food(name);
  }

}