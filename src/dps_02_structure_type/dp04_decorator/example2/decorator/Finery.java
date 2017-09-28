package dps_02_structure_type.dp04_decorator.example2.decorator;

import dps_02_structure_type.dp04_decorator.example2.component.IPerson;

/**
 * 抽象装饰（Decorator）角色：持有一个构件（Component）对象的实例，并定义一个与抽象构件接口一致的接口。 
 * @author Administrator
 */
public class Finery implements IPerson {

  /**人*/
  protected IPerson component;

  /**
   * 装饰<br>
   * @param component
   */
  public void decorate(IPerson component) {
    this.component = component;
  }

  /**
   * 展示自己
   */
  public void show() {
    if (component != null) {
      component.show();
    }
  }

}
