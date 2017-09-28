package dps_02_structure_type.dp06_flyweight.example2.flyweight_factory;

import java.util.Hashtable;

import dps_02_structure_type.dp06_flyweight.example2.Kitchener;
import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;

/**
 * ��Ԫ����(FlyweightFactory)��ɫ:����ɫ���𴴽��͹�����Ԫ��ɫ.<br>
 * �����ǲ˵Ĵ�����<br>
 * @author Administrator
 */
public class Storage {

  private Hashtable<String, AbsFood> table = new Hashtable<String, AbsFood>();

  /**
   * ���ݲ�����ȡһ�̲�<br>
   * ���﷽������Ҫͬ��,��ΪHashtable���̰߳�ȫ��<br>
   * @param name
   * @return AbsFood
   */
  public AbsFood getFood(String name) {
    if (table.containsKey(name)) {
      //do nothing
    } else {
      table.put(name, new Kitchener().cook(name));
    }
    return table.get(name);
  }

}
