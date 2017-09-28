package dps_01_build_type.dp01_singleton.register.example1;

/**
 * 从RegisterSingleton继承而来的另一实例<br>
 * 此类是RegisterSingleton的子类，可以通过RegisterSingleton.getInstance()获得<br>
 * 但必须传入类的全称<br>
 * @author Administrator
 */
public class RegisterSingletonChild extends RegisterSingleton {

  /**
   * 受保护的构造函数，只有子类和同一包中的类可以实例化<br>
   * 有危险性，因为protected修饰符不仅是子类可见，同一包中的非子类也可见，仅不同包中的非子类不可见
   */
  protected RegisterSingletonChild() {
  }

  /**
   * 一个示意性的商业方法<br>
   * 
   * @return String
   */
  public String about() {
    return "I'm RegisterSingletonChild.";
  }

}
