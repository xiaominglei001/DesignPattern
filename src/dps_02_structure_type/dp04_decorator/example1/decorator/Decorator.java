package dps_02_structure_type.dp04_decorator.example1.decorator;

import dps_02_structure_type.dp04_decorator.example1.component.Component;

/**
 * 抽象装饰（Decorator）角色：持有一个构件（Component）对象的实例，并定义一个与抽象构件接口一致的接口。 
 * @author Administrator
 */
public class Decorator implements Component {

  /**抽象构件（Component）角色*/
  protected Component component;

  /**
   * 具体操作
   */
  public void operation() {
    if (component != null) {
      component.operation();
    }
  }

  /**
   * @param component the component to set
   */
  public void setComponent(Component component) {
    this.component = component;
  }

}
