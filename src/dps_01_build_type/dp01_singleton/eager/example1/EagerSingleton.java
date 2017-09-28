package dps_01_build_type.dp01_singleton.eager.example1;

/**
 * ����ʽ����(Ψһ��ɫ���౾��):<br>
 * ���౻���ص�ʱ��Ψһʵ���Ѿ���������������ģʽ��Java������ʵ�֣��ڱ������������ʵ�֡�<br>
 * @author Administrator
 */
public class EagerSingleton {

  /**˽�е�(private)Ψһ(static final)ʵ����Ա,������ص�ʱ��ʹ������˵�������*/
  private static final EagerSingleton instance = new EagerSingleton();

  /**
   * ˽�й��캯��,������ⲿ����ʵ��
   */
  private EagerSingleton() {
  }

  /**
   * ��̬��������,���ش����Ψһʵ��.<br>
   * @return EagerSingleton      
   */
  public static EagerSingleton getInstance() {
    return instance;
  }

}