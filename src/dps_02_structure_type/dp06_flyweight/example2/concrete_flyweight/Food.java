package dps_02_structure_type.dp06_flyweight.example2.concrete_flyweight;

import util.ClassUtil;
import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;

/**
 * ������Ԫ(ConcreteFlyweight)��ɫ:ʵ�ֳ�����Ԫ��ɫ���涨�Ľӿ�.<br>
 * �����ǲ�<br>
 * @author Administrator
 */
public class Food extends AbsFood {

  /**
   * ���캯��<br>
   * @param name
   */
  public Food(String name) {
    super(name);
  }

  /**
   * ��ӡ���Լ��Ĳ���
   */
  public void display() {
    //����Ϊ�˷���,�Ѿ����ʵ��ϸ�ڽ���������ClassUtil����,��ȻҲ�����Լ�����.
    ClassUtil.display(this);
  }

}
