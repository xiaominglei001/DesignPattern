package dps_02_structure_type.dp06_flyweight.example1.flyweight_factory;

import java.util.Hashtable;

import dps_02_structure_type.dp06_flyweight.example1.concrete_flyweight.ConcreteFlyweight;
import dps_02_structure_type.dp06_flyweight.example1.flyweight.Flyweight;

/**
 * 享元工厂(FlyweightFactory)角色:本角色负责创建和管理享元角色.<br>
 * @author Administrator
 */
public class FlyweightFactory {

  private Hashtable<String, Flyweight> flaweights = new Hashtable<String, Flyweight>();

  /**
   * 根据key获取享元对象<br>
   * 这里方法不需要同步,因为Hashtable是线程安全的<br>
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
