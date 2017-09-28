package dps_03_action_type.dp06_memento.example2;

import util.ClassUtil;
import dps_03_action_type.dp06_memento.example2.caretaker.Caretaker;
import dps_03_action_type.dp06_memento.example2.originator.Originator;

/**
 * ������<br>
 * ��״̬����<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //��������Originator����ɫ:
    Originator o = new Originator("900", "350");//��ʼ��
    System.out.println("��ʼ����:");
    ClassUtil.display(o);

    //��������¼���󣬲��������˶����״̬��������(���ݵ�1��)
    Caretaker c = new Caretaker();//����¼�����߽�ɫ
    String versionId1 = "001";//�汾��1
    c.addMemento(o.createMemento(versionId1));//����

    //�ı䷢���˶����״̬(�ı��1��)
    o.setForce("119");
    o.setQuick("119");
    System.out.println("\n��1�θı��:");
    ClassUtil.display(o);

    //��������¼���󣬲��������˶����״̬��������(���ݵ�2��)
    String versionId2 = "002";//�汾��2
    c.addMemento(o.createMemento(versionId2));//����

    //�ı䷢���˶����״̬(�ı��2��)
    o.setForce("0");
    o.setQuick("0");
    System.out.println("\n��2�θı��:");
    ClassUtil.display(o);

    //�ָ������˵�״̬(�ָ����汾001)
    o.restoreMemento(c.getMemento(versionId1));
    System.out.println("\n�ָ���001�汾:");
    ClassUtil.display(o);

    //�ָ������˵�״̬(�ָ����汾002)
    o.restoreMemento(c.getMemento(versionId2));
    System.out.println("\n�ָ���002�汾:");
    ClassUtil.display(o);
  }

}
