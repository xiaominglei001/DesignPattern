package dps_01_build_type.dp01_singleton.register.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * �Ǽ�ʽ����(Ψһ��ɫ���౾��):<br>
 * �������ʵ����ά������һ�鵥�����ʵ��������Щʵ�������һ��Map���ǼǱ����У�<br>
 * �����Ѿ��Ǽǹ���ʵ������ӹ���ֱ�ӷ��أ�����û�еǼǵģ����ȵǼǣ����󷵻ء�<br>
 * �Ǽ�ʽ��������Ϊ�˿˷�����ʽ�����༰����ʽ����������ɼ̳е�ȱ�����Ƶġ�<br>
 * @author Administrator
 */
public class RegisterSingleton {

  /**�ǼǱ�,����������еǼǵ�ʵ��*/
  private static Map<String, RegisterSingleton> map = new HashMap<String, RegisterSingleton>();

  /**
   * ������ص�ʱ�����һ��ʵ�����ǼǱ�(ȱʡ)
   */
  static {
    RegisterSingleton instance = new RegisterSingleton();
    map.put(instance.getClass().getName(), instance);
  }

  /**
   * �ܱ����Ĺ��캯����ֻ�������ͬһ���е������ʵ����<br>
   * ��Σ���ԣ���Ϊprotected���η�����������ɼ���ͬһ���еķ�����Ҳ�ɼ�������ͬ���еķ����಻�ɼ�
   */
  protected RegisterSingleton() {
  }

  /**
   * ��̬��������,����ָ���ǼǶ����Ψһʵ��<br>
   * �����ѵǼǵ�ֱ��ȡ������,���ڻ�δ�Ǽǵ�,�ȵǼ�,Ȼ��ȡ������<br>
   * @param className
   * @return RegisterSingleton
   * @throws Exception 
   */
  public synchronized static RegisterSingleton getInstance(String className)
      throws Exception {
    if (map.containsKey(className)) {
      //do nothing
    } else {
      try {
        map.put(className, (RegisterSingleton) Class.forName(className)
            .newInstance());
      } catch (Exception e) {
        //���������������ﲶ���쳣Ӧ�÷ֿ������񣬲��������׳�������Ϊ�����ֻ����һ����
        throw new Exception(e.getMessage());
      }
    }
    return map.get(className);
  }

  /**
   * һ��ʾ���Ե���ҵ����<br>
   * @return String
   */
  public String about() {
    return "I'm RegisterSingleton.";
  }

}
