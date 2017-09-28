package dps_02_structure_type.dp06_flyweight.example3.flyweight;

import dps_02_structure_type.dp06_flyweight.example3.User;

/**
 * 抽象享元(Flyweight)角色:此角色是所有的具体享元类的基类,为这些类规定出需要实现的公共接口<br>
 * 这里是网站<br>
 * @author Administrator
 */
public interface Website {

  /**
   * 使用方法,需要传递用户对象user<br>
   * @param user 
   */
  public void use(User user);

}