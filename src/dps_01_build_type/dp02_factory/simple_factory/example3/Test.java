package dps_01_build_type.dp02_factory.simple_factory.example3;

import dps_01_build_type.dp02_factory.simple_factory.example3.concrete_creator.LeiFengFactory;
import dps_01_build_type.dp02_factory.simple_factory.example3.product.LeiFeng;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    System.out.println("ѧ��:");
    //�����Ʒ��ɫ���׷�,����(1:ѧ�� 2:־Ը��)
    LeiFeng student = LeiFengFactory.createLeiFeng(1);//����ѧ�׷�xx�Ĺ���
    //������Ϊ:����,ɨ��,ϴ��
    student.buyRice();
    student.sweep();
    student.wash();
    System.out.println("\n");

    System.out.println("־Ը��:");
    //�����Ʒ��ɫ���׷�,����(1:ѧ�� 2:־Ը��)
    LeiFeng volunteer = LeiFengFactory.createLeiFeng(2);//����ѧ�׷�xx�Ĺ���
    //������Ϊ:����,ɨ��,ϴ��
    volunteer.buyRice();
    volunteer.sweep();
    volunteer.wash();
  }

}
