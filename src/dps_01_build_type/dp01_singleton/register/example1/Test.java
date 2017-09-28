package dps_01_build_type.dp01_singleton.register.example1;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    //定义两个登陆式单例的完整类名
    String packageName = new Test().getClass().getPackage().getName();//获取package名
    String className1 = packageName + ".RegisterSingleton";//拼接成完整类名
    String className2 = packageName + ".RegisterSingletonChild";//拼接成完整类名

    //登记式单例:
    RegisterSingleton instance1 = RegisterSingleton.getInstance(className1);
    RegisterSingleton instance2 = RegisterSingleton.getInstance(className1);
    RegisterSingleton instance3 = RegisterSingleton.getInstance(className2);
    RegisterSingleton instance4 = RegisterSingleton.getInstance(className2);

    //从输出结果可以看出前两次创建的实例是同一对象,后两次创建的是同一对象
    System.out.println("登记式单例:");
    System.out.println(instance1);
    System.out.println(instance2);
    System.out.println(instance3);
    System.out.println(instance4);
  }

}
