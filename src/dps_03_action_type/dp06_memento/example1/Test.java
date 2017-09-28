package dps_03_action_type.dp06_memento.example1;

import dps_03_action_type.dp06_memento.example1.caretaker.Caretaker;
import dps_03_action_type.dp06_memento.example1.originator.Originator;

/**
 * ������<br>
 * ��һ״̬����<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //��������Originator����ɫ:
    Originator o = new Originator("A");//��ʼ��
    System.out.println("��ʼ����:" + o.getState());

    //��������¼���󣬲��������˶����״̬��������(����)
    Caretaker c = new Caretaker();//����¼�����߽�ɫ
    c.setSaveMemento(o.createMemento());

    //�ı䷢���˶����״̬ΪB(�ı�)
    o.setState("B");
    System.out.println("\n�ı��:" + o.getState() + "\n");

    //�ָ������˵�״̬(�ָ�)
    o.restoreMemento(c.getSaveMemento());
    System.out.println("�ָ���:" + o.getState());
  }

}
