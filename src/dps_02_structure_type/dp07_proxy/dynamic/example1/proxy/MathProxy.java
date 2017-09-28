package dps_02_structure_type.dp07_proxy.dynamic.example1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �����ɫ,ִ�ж���ʵ����Ĳ���<br>
 * ������,�����ö�̬����<br>
 * @author Administrator
 */
public class MathProxy implements InvocationHandler {

  /**ί�е���,�������κ���*/
  private Object delegate;

  /**
   * ��ί�е���󶨸�������<br>
   * @param delegate
   * @return Object
   */
  public Object bind(Object delegate) {
    this.delegate = delegate;
    return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
        delegate.getClass().getInterfaces(), this);
  }

  /**
   * ��̬����ί�ж���ķ���<br>
   * @param proxy
   * @param method
   * @param args
   * @return Object
   * @throws Throwable
   */
  public Object invoke(@SuppressWarnings("unused")
  Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(delegate, args);
  }

}
