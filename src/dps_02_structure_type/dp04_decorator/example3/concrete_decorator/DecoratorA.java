package dps_02_structure_type.dp04_decorator.example3.concrete_decorator;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp04_decorator.example3.component.Action;
import dps_02_structure_type.dp04_decorator.example3.decorator.AbsDecorator;

/**
 * ����װ�Σ�Concrete Decorator����ɫ���������������"����"���ӵ�����<br>
 * @author Administrator
 */
public class DecoratorA extends AbsDecorator {

  /**�ڴ���*/
  private List<String> memorys = new ArrayList<String>();

  /**
   * ���캯��<br>
   * @param action
   */
  public DecoratorA(Action action) {
    super(action);
  }

  /**
   * ����һ���ڴ���<br>
   * @param memory
   */
  public void addMemory(String memory) {
    memorys.add(memory);
  }

  /**
   * �������ǶԿ����Ķ�����������װ��:<br>
   * 1.����һ��1.0G���ڴ���<br>
   * 2.������һ��2.5���ڴ���<br>
   * 3.��ʾ�������ڴ�<br>
   */
  public void start() {
    //װ�εĲ��ֿ�ʼ
    addMemory("1.0G");
    addMemory("2.5G");
    for (String memory : memorys) {
      System.out.println("Memory: " + memory);
    }
    //װ�εĲ��ֽ���

    //ԭ������ɫ�Ŀ�����������
    action.start();
  }

  /**
   * �������ǶԹػ��Ķ���������װ��
   */
  public void shutdown() {
    action.shutdown();
  }

}
