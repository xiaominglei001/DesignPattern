package dps_02_structure_type.dp04_decorator.example2.decorator;

import dps_02_structure_type.dp04_decorator.example2.component.IPerson;

/**
 * ����װ�Σ�Decorator����ɫ������һ��������Component�������ʵ����������һ������󹹼��ӿ�һ�µĽӿڡ� 
 * @author Administrator
 */
public class Finery implements IPerson {

  /**��*/
  protected IPerson component;

  /**
   * װ��<br>
   * @param component
   */
  public void decorate(IPerson component) {
    this.component = component;
  }

  /**
   * չʾ�Լ�
   */
  public void show() {
    if (component != null) {
      component.show();
    }
  }

}
