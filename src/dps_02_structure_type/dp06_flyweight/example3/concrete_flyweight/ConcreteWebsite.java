package dps_02_structure_type.dp06_flyweight.example3.concrete_flyweight;

import dps_02_structure_type.dp06_flyweight.example3.User;
import dps_02_structure_type.dp06_flyweight.example3.flyweight.Website;

/**
 * 具体享元(ConcreteFlyweight)角色:实现抽象享元角色所规定的接口.<br>
 * 具体网站<br>
 * @author Administrator
 */
public class ConcreteWebsite implements Website {

  /**网站分类*/
  private String classfy;

  /**
   * 构造函数<br>
   * @param classfy
   */
  public ConcreteWebsite(String classfy) {
    this.classfy = classfy;
  }

  /**
   * 使用方法,需要传递用户对象user<br>
   * @param user 
   */
  public void use(User user) {
    System.out.println("网站分类:" + classfy + " 用户:" + user.getName());
  }

}
