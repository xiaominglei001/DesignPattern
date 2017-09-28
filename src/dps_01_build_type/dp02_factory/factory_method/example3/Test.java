package dps_01_build_type.dp02_factory.factory_method.example3;

import dps_01_build_type.dp02_factory.factory_method.example3.concrete_creator.FactoryUndergraduate;
import dps_01_build_type.dp02_factory.factory_method.example3.concrete_creator.FactoryVolunteer;
import dps_01_build_type.dp02_factory.factory_method.example3.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example3.product.LeiFeng;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("ѧ��:");
    //���󹤳���ɫ�������׷�ĳ��󷽷�
    Factory factory1 = new FactoryUndergraduate();//����ѧ�׷�ѧ���Ĺ���
    //�����Ʒ��ɫ���׷�
    LeiFeng student = factory1.createLeiFeng();//����ѧ�׷��ѧ��
    //������Ϊ:����,ɨ��,ϴ��
    student.buyRice();
    student.sweep();
    student.wash();
    System.out.println("\n");

    System.out.println("־Ը��:");
    //���󹤳���ɫ�������׷�ĳ��󷽷�
    Factory factory2 = new FactoryVolunteer();//����ѧ�׷�־Ը�ߵĹ���
    //�����Ʒ��ɫ���׷�
    LeiFeng volunteer = factory2.createLeiFeng();//����ѧ�׷��־Ը��
    //������Ϊ:����,ɨ��,ϴ��
    volunteer.buyRice();
    volunteer.sweep();
    volunteer.wash();
  }

}
