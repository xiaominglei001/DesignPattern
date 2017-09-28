package dps_03_action_type.dp07_observer.example5.concrete_subject;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import dps_03_action_type.dp07_observer.example5.subject.Subject;

/**
 * �������⣨��ɹ۲��ߣ���ɫ:ǰ̨<br>
 * @author Administrator
 */
public class Secretary implements Subject {

  /**֪ͨ������·�������*/
  private Map<Object, Method> map = new HashMap<Object, Method>();

  /**
   * ֪ͨ���й۲���<br>
   * @param args 
   * @throws Exception 
   */
  public void notify_(Object args) throws Exception {
    try {
      //���ڹ۲��߲�û��ʵ��ͳһ�ӿڣ�C#����ί�������������÷�����֪ͨ
      for (Object object : map.keySet()) {
        Method method = map.get(object);
        method.invoke(object, args);//֪ͨ�۲���
      }
      //���������������ﲶ���쳣Ӧ�÷ֿ������񣬲��������׳�������Ϊ�����ֻ����һ����
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }

  }

  /**
   * ��ί�е���󶨸�������<br>
   * @param object 
   * @param method 
   */
  public void bind(Object object, Method method) {
    map.put(object, method);
  }

}
