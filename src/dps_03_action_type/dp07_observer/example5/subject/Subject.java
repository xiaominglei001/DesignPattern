package dps_03_action_type.dp07_observer.example5.subject;

import java.lang.reflect.Method;

/**
 * 抽象主题（或可观察者）角色<br>
 * 声明通知者接口<br>
 * @author Administrator
 */
public interface Subject {

  /**
   * 通知所有观察者<br>
   * @param args 
   * @throws Exception 
   */
  public void notify_(Object args) throws Exception;

  /**
   * 把委托的类绑定给代理类<br>
   * @param delegate
   * @param method 
   */
  public void bind(Object delegate, Method method);

}
