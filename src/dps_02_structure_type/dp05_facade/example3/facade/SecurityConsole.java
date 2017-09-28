package dps_02_structure_type.dp05_facade.example3.facade;

import dps_02_structure_type.dp05_facade.example3.subsystem.Alarm;
import dps_02_structure_type.dp05_facade.example3.subsystem.Camera;
import dps_02_structure_type.dp05_facade.example3.subsystem.Light;

/**
 * �����ɫ:һ��ϵͳ�Ŀ���̨,��Ϊ����ϵͳ���û�����.<br>
 * ע��:������ģʽ��,ͨ��ֻ��Ҫһ��������,���Ҵ�������ֻ��һ��ʵ��,����֮����һ��������.<br>
 * ���������õ���ģʽ(����ʽ)�����������ʵ��,���ͻ��˵���<br>
 * @author Administrator
 */
public class SecurityConsole {

  /**�����*/
  private static Camera camera1, camera2;
  /**���*/
  private static Light light1, light2, light3;
  /**������*/
  private static Alarm alarm;
  /**����̨*/
  private static SecurityConsole intsance;

  /**
   * ˽�й��캯��,������ⲿ����ʵ��
   */
  private SecurityConsole() {
  }

  /**
   * @return SecurityConsole
   */
  public synchronized static SecurityConsole getInstance() {
    if (intsance == null) {
      intsance = new SecurityConsole();
    }
    return intsance;
  }

  /**
   * ��̬������ʼ������(�ڴ���ʵ��֮ǰ��,����ֻ��һ��)
   */
  static {
    camera1 = new Camera();
    camera2 = new Camera();
    light1 = new Light();
    light2 = new Light();
    light3 = new Light();
    alarm = new Alarm();
  }

  /**
   * ����̨��һ����Ŧ:����һ��
   */
  public void Activate() {
    camera1.turnOn();
    camera2.turnOn();
    light1.turnOn();
    light2.turnOn();
    light3.turnOn();
    alarm.activate();
  }

  /**
   * ����̨��һ����Ŧ:�ر�һ��
   */
  public void Deactivate() {
    camera1.turnOff();
    camera2.turnOff();
    light1.turnOff();
    light2.turnOff();
    light3.turnOff();
    alarm.deactivate();
  }

}
