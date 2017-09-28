package dps_02_structure_type.dp07_proxy.static_.example1.proxy;

import dps_02_structure_type.dp07_proxy.static_.example1.real_subject.RealSubject;
import dps_02_structure_type.dp07_proxy.static_.example1.subject.Subject;

/**
 * 代理角色：代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，<br>
 * 同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。<br>
 * 同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。<br>
 * 代理类,这里用静态代理<br>
 * @author Administrator
 */
public class Proxy implements Subject {

  /**真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。*/
  private RealSubject realSubject;

  /**
   * 代理发送请求
   */
  public void request() {
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    //真正发送请求的方法
    realSubject.request();
  }

}
