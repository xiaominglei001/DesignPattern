package dps_02_structure_type.dp06_flyweight.example1.flyweight_factory;

import java.util.Hashtable;

import dps_02_structure_type.dp06_flyweight.example1.concrete_flyweight.ConcreteFlyweight;
import dps_02_structure_type.dp06_flyweight.example1.flyweight.Flyweight;

/**
 * ��Ԫ����(FlyweightFactory)��ɫ:����ɫ���𴴽��͹�����Ԫ��ɫ.<br>
 * @author Administrator
 */
public class FlyweightFactory {

  private Hashtable<String, Flyweight> flaweights = new Hashtable<String, Flyweight>();

  /**
   * ����key��ȡ��Ԫ����<br>
   * ���﷽������Ҫͬ��,��ΪHashtable���̰߳�ȫ��<br>
   * @param key 
   * @return Flyweight
   */
  public Flyweight getFlyweight(String key) {
    if (flaweights.containsKey(key)) {
      //do nothing
    } else {
      flaweights.put(key, new ConcreteFlyweight());
    }
    return flaweights.get(key);
  }

}
