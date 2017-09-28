package dps_01_build_type.dp01_singleton.register.example1;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    //����������½ʽ��������������
    String packageName = new Test().getClass().getPackage().getName();//��ȡpackage��
    String className1 = packageName + ".RegisterSingleton";//ƴ�ӳ���������
    String className2 = packageName + ".RegisterSingletonChild";//ƴ�ӳ���������

    //�Ǽ�ʽ����:
    RegisterSingleton instance1 = RegisterSingleton.getInstance(className1);
    RegisterSingleton instance2 = RegisterSingleton.getInstance(className1);
    RegisterSingleton instance3 = RegisterSingleton.getInstance(className2);
    RegisterSingleton instance4 = RegisterSingleton.getInstance(className2);

    //�����������Կ���ǰ���δ�����ʵ����ͬһ����,�����δ�������ͬһ����
    System.out.println("�Ǽ�ʽ����:");
    System.out.println(instance1);
    System.out.println(instance2);
    System.out.println(instance3);
    System.out.println(instance4);
  }

}
