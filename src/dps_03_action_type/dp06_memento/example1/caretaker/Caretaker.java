package dps_03_action_type.dp06_memento.example1.caretaker;

import dps_03_action_type.dp06_memento.example1.memento.Memento;

/**
 * ����¼�����ߣ�Caretaker����ɫ�����𱣴�ñ���¼�����ܶԱ���¼�����ݽ��в������顣<br>
 * @author Administrator
 */
public class Caretaker {

  /**����¼*/
  private Memento saveMemento;

  /**
   * @return the saveMemento
   */
  public Memento getSaveMemento() {
    return saveMemento;
  }

  /**
   * @param saveMemento the saveMemento to set
   */
  public void setSaveMemento(Memento saveMemento) {
    this.saveMemento = saveMemento;
    System.out.println("�������˶����״̬���������ˣ�");
  }

}
