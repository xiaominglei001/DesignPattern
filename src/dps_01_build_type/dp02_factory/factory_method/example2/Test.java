package dps_01_build_type.dp02_factory.factory_method.example2;

import dps_01_build_type.dp02_factory.factory_method.example2.concrete_creator.FactoryAdd;
import dps_01_build_type.dp02_factory.factory_method.example2.concrete_creator.FactoryDiv;
import dps_01_build_type.dp02_factory.factory_method.example2.concrete_creator.FactoryMul;
import dps_01_build_type.dp02_factory.factory_method.example2.concrete_creator.FactorySub;
import dps_01_build_type.dp02_factory.factory_method.example2.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    double a = 12;
    double b = 5;

    //���󹤳���ɫ���������������ʵ��
    Factory f1 = new FactoryAdd();
    Factory f2 = new FactorySub();
    Factory f3 = new FactoryMul();
    Factory f4 = new FactoryDiv();

    //�����Ʒ��ɫ������
    Operation o1 = f1.createOperation();
    Operation o2 = f2.createOperation();
    Operation o3 = f3.createOperation();
    Operation o4 = f4.createOperation();

    //��ȡ����Ľ��
    //��ȡ����Ľ��
    System.out.println(o1.getResult(a, b));
    System.out.println(o2.getResult(a, b));
    System.out.println(o3.getResult(a, b));
    System.out.println(o4.getResult(a, b));
  }

}
