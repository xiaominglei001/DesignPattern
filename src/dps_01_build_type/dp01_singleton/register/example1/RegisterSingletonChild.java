package dps_01_build_type.dp01_singleton.register.example1;

/**
 * ��RegisterSingleton�̳ж�������һʵ��<br>
 * ������RegisterSingleton�����࣬����ͨ��RegisterSingleton.getInstance()���<br>
 * �����봫�����ȫ��<br>
 * @author Administrator
 */
public class RegisterSingletonChild extends RegisterSingleton {

  /**
   * �ܱ����Ĺ��캯����ֻ�������ͬһ���е������ʵ����<br>
   * ��Σ���ԣ���Ϊprotected���η�����������ɼ���ͬһ���еķ�����Ҳ�ɼ�������ͬ���еķ����಻�ɼ�
   */
  protected RegisterSingletonChild() {
  }

  /**
   * һ��ʾ���Ե���ҵ����<br>
   * 
   * @return String
   */
  public String about() {
    return "I'm RegisterSingletonChild.";
  }

}
