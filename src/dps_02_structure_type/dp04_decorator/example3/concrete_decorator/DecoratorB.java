package dps_02_structure_type.dp04_decorator.example3.concrete_decorator;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp04_decorator.example3.component.Action;
import dps_02_structure_type.dp04_decorator.example3.decorator.AbsDecorator;

/**
 * ����װ�Σ�Concrete Decorator����ɫ���������������"����"���ӵ�����<br>
 * @author Administrator
 */
public class DecoratorB extends AbsDecorator {

  /**Ӳ��*/
  private List<String> disks = new ArrayList<String>();

  /**
   * ���캯��<br>
   * @param action
   */
  public DecoratorB(Action action) {
    super(action);
  }

  /**
   * ����һ��Ӳ��<br>
   * @param disk
   */
  public void addMemory(String disk) {
    disks.add(disk);
  }

  /**
   * ����һ��Ӳ��<br>
   * @param disk
   */
  public void removeMemory(String disk) {
    disks.remove(disk);
  }

  /**
   * �������ǶԿ����Ķ�����������װ��:<br>
   * 1.����һ��1.0G���ڴ���<br>
   * 2.������һ��2.5���ڴ���<br>
   * 3.��ʾ�������ڴ�<br>
   */
  public void start() {
    //װ�εĲ��ֿ�ʼ
    addMemory("250");
    addMemory("160G");
    for (String disk : disks) {
      System.out.println("Disk: " + disk);
    }
    //װ�εĲ��ֽ���

    //ԭ������ɫ�Ŀ�����������
    action.start();
  }

  /**
   * �������ǶԹػ��Ķ�����������װ��:<br>
   * 1.����250G��Ӳ��<br>
   * 2.�ٲ���160G��Ӳ��<br>
   */
  public void shutdown() {
    //װ�εĲ��ֿ�ʼ
    removeMemory("250");
    removeMemory("160G");
    //װ�εĲ��ֽ���
    action.shutdown();
  }

}
