package dps_02_structure_type.dp06_flyweight.example2.flyweight_factory;

import java.util.Hashtable;

import dps_02_structure_type.dp06_flyweight.example2.Kitchener;
import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;

/**
 * 享元工厂(FlyweightFactory)角色:本角色负责创建和管理享元角色.<br>
 * 这里是菜的储藏室<br>
 * @author Administrator
 */
public class Storage {

  private Hashtable<String, AbsFood> table = new Hashtable<String, AbsFood>();

  /**
   * 根据菜名获取一盘菜<br>
   * 这里方法不需要同步,因为Hashtable是线程安全的<br>
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
