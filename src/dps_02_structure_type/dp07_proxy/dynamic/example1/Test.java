package dps_02_structure_type.dp07_proxy.dynamic.example1;

import java.util.ArrayList;
import java.util.List;

import dps_02_structure_type.dp07_proxy.dynamic.example1.proxy.MathProxy;
import dps_02_structure_type.dp07_proxy.dynamic.example1.real_subject.Math;
import dps_02_structure_type.dp07_proxy.dynamic.example1.subject.IMath;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    //�����ɫ,ִ�ж���ʵ����Ĳ���
    MathProxy proxy = new MathProxy();

    //��ʾ��1
    IMath math = (IMath) proxy.bind(new Math());
    System.out.println(math.add(10, 20));
    System.out.println(math.sub(10, 20));

    //��ʾ��2
    List list = (List) proxy.bind(new ArrayList());
    list.add("tom");
    list.add("jim");
    System.out.println(list);
  }

}
