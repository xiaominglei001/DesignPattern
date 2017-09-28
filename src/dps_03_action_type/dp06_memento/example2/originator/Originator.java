package dps_03_action_type.dp06_memento.example2.originator;

import dps_03_action_type.dp06_memento.example2.memento.Memento;

/**
 * ��������Originator����ɫ�������������ɫ������һ������¼��<br>
 * ���Լ�¼��ǰʱ�������ڲ�״̬������Ҫʱʹ�ñ���¼�ָ��ڲ�״̬��<br>
 * @author Administrator
 */
public class Originator {

  /**״̬����,����*/
  private String force;

  /**״̬����,���ݶ�*/
  private String quick;

  /**
   * ���캯��,��ʼ��һ��״̬<br>
   * @param force
   * @param quick
   */
  public Originator(String force, String quick) {
    this.force = force;
    this.quick = quick;
  }

  /**
   * @return the force
   */
  public String getForce() {
    return force;
  }

  /**
   * @param force the force to set
   */
  public void setForce(String force) {
    this.force = force;
  }

  /**
   * @return the quick
   */
  public String getQuick() {
    return quick;
  }

  /**
   * @param quick the quick to set
   */
  public void setQuick(String quick) {
    this.quick = quick;
  }

  /**
   * ��������¼<br>
   * @param versionId 
   * @return Memento
   */
  public Memento createMemento(String versionId) {
    return new Memento(versionId, force, quick);
  }

  /**
   * ���ݱ���¼��ɻָ�<br>
   * @param memento
   */
  public void restoreMemento(Memento memento) {
    force = memento.getForce();
    quick = memento.getQuick();
    System.out.println("�ָ�������[" + memento.getVersionId() + "]��״̬��");
  }

}
