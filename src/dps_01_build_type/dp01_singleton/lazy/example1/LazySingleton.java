package dps_01_build_type.dp01_singleton.lazy.example1;

/**
 * ����ʽ����(Ψһ��ɫ���౾��):<br>
 * ������ص�ʱ�򲻴�������ʵ����<br>
 * ֻ���ڵ�һ������ʵ����ʱ���ʱ�򴴽�������ֻ�ڵ�һ�δ������Ժ��ٴ��������ʵ����<br>
 * @author Administrator
 */
public class LazySingleton {

  /**˽�о�̬����,����ʱ������ʼ��*/
  private static LazySingleton instance;

  /**
   * ˽�й��캯��,������ⲿ����ʵ��
   */
  private LazySingleton() {
  }

  /**
   * ��̬��������,���ش����Ψһʵ��. ������ʵ��û�г�ʼ����ʱ��,�ų�ʼ��.<br>
   * @return LazySingleton
   */
  public synchronized static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }

}