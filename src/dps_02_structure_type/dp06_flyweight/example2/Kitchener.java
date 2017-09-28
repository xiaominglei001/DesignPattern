package dps_02_structure_type.dp06_flyweight.example2;

import dps_02_structure_type.dp06_flyweight.example2.concrete_flyweight.Food;
import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;

/**
 * 不属于享元模式的角色,这里只是用来做菜的一个厨师<br>
 * @author Administrator
 */
public class Kitchener {

  /**
   * 做菜的过程<br>
   * @param name
   * @return AbsFood
   */
  public AbsFood cook(String name) {
    return new Food(name);
  }

}