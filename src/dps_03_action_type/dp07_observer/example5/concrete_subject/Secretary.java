package dps_03_action_type.dp07_observer.example5.concrete_subject;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import dps_03_action_type.dp07_observer.example5.subject.Subject;

/**
 * 具体主题（或可观察者）角色:前台<br>
 * @author Administrator
 */
public class Secretary implements Subject {

  /**通知者与更新方法集合*/
  private Map<Object, Method> map = new HashMap<Object, Method>();

  /**
   * 通知所有观察者<br>
   * @param args 
   * @throws Exception 
   */
  public void notify_(Object args) throws Exception {
    try {
      //由于观察者并没有实现统一接口，C#中用委托来处理，这里用反射来通知
      for (Object object : map.keySet()) {
        Method method = map.get(object);
        method.invoke(object, args);//通知观察者
      }
      //理论上来讲，这里捕获异常应该分开来捕获，并且向上抛出，这里为简单起见只做单一捕获
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }

  }

  /**
   * 把委托的类绑定给代理类<br>
   * @param object 
   * @param method 
   */
  public void bind(Object object, Method method) {
    map.put(object, method);
  }

}
