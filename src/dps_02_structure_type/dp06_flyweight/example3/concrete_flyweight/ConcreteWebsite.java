package dps_02_structure_type.dp06_flyweight.example3.concrete_flyweight;

import dps_02_structure_type.dp06_flyweight.example3.User;
import dps_02_structure_type.dp06_flyweight.example3.flyweight.Website;

/**
 * ������Ԫ(ConcreteFlyweight)��ɫ:ʵ�ֳ�����Ԫ��ɫ���涨�Ľӿ�.<br>
 * ������վ<br>
 * @author Administrator
 */
public class ConcreteWebsite implements Website {

  /**��վ����*/
  private String classfy;

  /**
   * ���캯��<br>
   * @param classfy
   */
  public ConcreteWebsite(String classfy) {
    this.classfy = classfy;
  }

  /**
   * ʹ�÷���,��Ҫ�����û�����user<br>
   * @param user 
   */
  public void use(User user) {
    System.out.println("��վ����:" + classfy + " �û�:" + user.getName());
  }

}
