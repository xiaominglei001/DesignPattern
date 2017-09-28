package dps_02_structure_type.dp04_decorator.example3;

import dps_02_structure_type.dp04_decorator.example3.component.Action;
import dps_02_structure_type.dp04_decorator.example3.concrete_component.Computer;
import dps_02_structure_type.dp04_decorator.example3.concrete_decorator.DecoratorA;
import dps_02_structure_type.dp04_decorator.example3.concrete_decorator.DecoratorB;
import dps_02_structure_type.dp04_decorator.example3.decorator.AbsDecorator;

/**
 * ������<br>
 * ��ʾ���Ƿ����װ��ģʽ�д���ȶ!!!!!!!!!!!!!!!!!!!!!!!<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����δ����װ�εĿ���������:computer.start();
    //����װ�κ�Ŀ���������:decorator.start();
    //���󹹼���Component����ɫ:�����ǵ��ԵĶ���
    Action computer = new Computer();

    //����װ�Σ�Decorator����ɫ
    AbsDecorator decoratorA = new DecoratorA(computer);
    decoratorA.start();//����
    System.out.println();

    AbsDecorator decoratorB = new DecoratorB(computer);
    decoratorB.start();//����
  }

}
