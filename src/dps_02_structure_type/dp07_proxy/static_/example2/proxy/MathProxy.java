package dps_02_structure_type.dp07_proxy.static_.example2.proxy;

import dps_02_structure_type.dp07_proxy.static_.example2.real_subject.Math;
import dps_02_structure_type.dp07_proxy.static_.example2.subject.IMath;

/**
 * 代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，<br>
 * 同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。<br>
 * 同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。<br>
 * 代理类,这里用静态代理<br>
 * @author Administrator
 */
public class MathProxy implements IMath {

  /**委托的类:计算器的实现类*/
  private Math delegate;

  /**
   * 构造函数
   */
  public MathProxy() {
    this.delegate = new Math();
  }

  /**
   * 加法<br>
   * @param x
   * @param y
   * @return double
   */
  public double add(double x, double y) {
    return delegate.add(x, y);
  }

  /**
   * 减法<br>
   * @param x
   * @param y
   * @return double
   */
  public double sub(double x, double y) {
    return delegate.sub(x, y);
  }

}
