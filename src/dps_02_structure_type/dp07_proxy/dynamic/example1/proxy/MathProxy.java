package dps_02_structure_type.dp07_proxy.dynamic.example1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理角色,执行对真实对象的操作<br>
 * 代理类,这里用动态代理<br>
 * @author Administrator
 */
public class MathProxy implements InvocationHandler {

  /**委托的类,可以是任何类*/
  private Object delegate;

  /**
   * 把委托的类绑定给代理类<br>
   * @param delegate
   * @return Object
   */
  public Object bind(Object delegate) {
    this.delegate = delegate;
    return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
        delegate.getClass().getInterfaces(), this);
  }

  /**
   * 动态调用委托对象的方法<br>
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
