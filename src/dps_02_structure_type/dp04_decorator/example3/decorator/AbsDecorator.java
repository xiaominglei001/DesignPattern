package dps_02_structure_type.dp04_decorator.example3.decorator;

import dps_02_structure_type.dp04_decorator.example3.component.Action;

/**
 * ����װ�Σ�Decorator����ɫ:����һ��������Component�������ʵ��,<br>
 * ������һ������󹹼��ӿ�һ�µĽӿ�.<br>
 * @author Administrator
 */
public abstract class AbsDecorator implements Action {

  /**���ԵĶ���*/
  protected Action action;

  /**
   * ���캯��<br>
   * @param action
   */
  public AbsDecorator(Action action) {
    this.action = action;
  }

}