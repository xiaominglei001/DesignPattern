package dps_03_action_type.dp07_observer.example5.subject;

import java.lang.reflect.Method;

/**
 * �������⣨��ɹ۲��ߣ���ɫ<br>
 * ����֪ͨ�߽ӿ�<br>
 * @author Administrator
 */
public interface Subject {

  /**
   * ֪ͨ���й۲���<br>
   * @param args 
   * @throws Exception 
   */
  public void notify_(Object args) throws Exception;

  /**
   * ��ί�е���󶨸�������<br>
   * @param delegate
   * @param method 
   */
  public void bind(Object delegate, Method method);

}
