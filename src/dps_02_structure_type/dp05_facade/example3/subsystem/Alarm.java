package dps_02_structure_type.dp05_facade.example3.subsystem;

/**
 * ��ϵͳ��ɫ:������<br>
 * @author Administrator
 */
public class Alarm {

  /**
   * ����������
   */
  public void activate() {
    System.out.println("Activating the alarm.");
  }

  /**
   * �رձ�����
   */
  public void deactivate() {
    System.out.println("Deactivating the alarm.");
  }

  /**
   * ���ڷ�������
   */
  public void ring() {
    System.out.println("Ringing the alarm.");
  }

  /**
   * ֹͣ����
   */
  public void stopRing() {
    System.out.println("Stop the alarm.");
  }

}
