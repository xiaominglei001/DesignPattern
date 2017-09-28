package dps_02_structure_type.dp07_proxy.static_.example1.real_subject;

import dps_02_structure_type.dp07_proxy.static_.example1.subject.Subject;

/**
 * 真实角色：代理角色所代表的真实对象，是我们最终要引用的对象。<br>
 * @author Administrator
 */
public class RealSubject implements Subject {

  /**
   * 发送请求
   */
  public void request() {
    System.out.println("真实的请求.");
  }

}