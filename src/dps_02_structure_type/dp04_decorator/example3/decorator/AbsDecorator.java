package dps_02_structure_type.dp04_decorator.example3.decorator;

import dps_02_structure_type.dp04_decorator.example3.component.Action;

/**
 * 抽象装饰（Decorator）角色:持有一个构件（Component）对象的实例,<br>
 * 并定义一个与抽象构件接口一致的接口.<br>
 * @author Administrator
 */
public abstract class AbsDecorator implements Action {

  /**电脑的动作*/
  protected Action action;

  /**
   * 构造函数<br>
   * @param action
   */
  public AbsDecorator(Action action) {
    this.action = action;
  }

}