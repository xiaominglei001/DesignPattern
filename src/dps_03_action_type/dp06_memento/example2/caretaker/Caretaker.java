package dps_03_action_type.dp06_memento.example2.caretaker;

import java.util.HashMap;
import java.util.Map;

import dps_03_action_type.dp06_memento.example2.memento.Memento;

/**
 * ����¼�����ߣ�Caretaker����ɫ�����𱣴�ñ���¼�����ܶԱ���¼�����ݽ��в������顣<br>
 * @author Administrator
 */
public class Caretaker {

  /**����¼����*/
  private static final Map<String, Memento> history = new HashMap<String, Memento>();

  /**
   * ��ȡһ����ǰ���ݹ���״̬<br>
   * @param versionId 
   * @return Memento
   */
  public Memento getMemento(String versionId) {
    return history.get(versionId);
  }

  /**
   * ����һ��״̬<br>
   * @param m
   */
  public void addMemento(Memento m) {
    history.put(m.getVersionId(), m);
    System.out.println("�������˶���[" + m.getVersionId() + "]��״̬���������ˣ�");
  }

}
