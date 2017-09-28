package dps_01_build_type.dp01_singleton.register.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例(唯一角色即类本身):<br>
 * 这个单例实际上维护的是一组单例类的实例，将这些实例存放在一个Map（登记薄）中，<br>
 * 对于已经登记过的实例，则从工厂直接返回，对于没有登记的，则先登记，而后返回。<br>
 * 登记式单例类是为了克服饿汉式单例类及懒汉式单例类均不可继承的缺点而设计的。<br>
 * @author Administrator
 */
public class RegisterSingleton {

  /**登记薄,用来存放所有登记的实例*/
  private static Map<String, RegisterSingleton> map = new HashMap<String, RegisterSingleton>();

  /**
   * 在类加载的时候添加一个实例到登记薄(缺省)
   */
  static {
    RegisterSingleton instance = new RegisterSingleton();
    map.put(instance.getClass().getName(), instance);
  }

  /**
   * 受保护的构造函数，只有子类和同一包中的类可以实例化<br>
   * 有危险性，因为protected修饰符不仅是子类可见，同一包中的非子类也可见，仅不同包中的非子类不可见
   */
  protected RegisterSingleton() {
  }

  /**
   * 静态工厂方法,返回指定登记对象的唯一实例<br>
   * 对于已登记的直接取出返回,对于还未登记的,先登记,然后取出返回<br>
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
        //理论上来讲，这里捕获异常应该分开来捕获，并且向上抛出，这里为简单起见只做单一捕获
        throw new Exception(e.getMessage());
      }
    }
    return map.get(className);
  }

  /**
   * 一个示意性的商业方法<br>
   * @return String
   */
  public String about() {
    return "I'm RegisterSingleton.";
  }

}
