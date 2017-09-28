package dps_02_structure_type.dp04_decorator.example1.decorator;

import dps_02_structure_type.dp04_decorator.example1.component.Component;

/**
 * ����װ�Σ�Decorator����ɫ������һ��������Component�������ʵ����������һ������󹹼��ӿ�һ�µĽӿڡ� 
 * @author Administrator
 */
public class Decorator implements Component {

  /**���󹹼���Component����ɫ*/
  protected Component component;

  /**
   * �������
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
