package dps_01_build_type.dp02_factory.simple_factory.example2;

import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_creator.OperationFactory;
import dps_01_build_type.dp02_factory.simple_factory.example2.product.Operation;

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
    double a = 12;
    double b = 5;

    //�����Ʒ��ɫ������
    Operation o1 = OperationFactory.createOperation("+");
    Operation o2 = OperationFactory.createOperation("-");
    Operation o3 = OperationFactory.createOperation("*");
    Operation o4 = OperationFactory.createOperation("/");

    //��ȡ����Ľ��
    System.out.println(o1.getResult(a, b));
    System.out.println(o2.getResult(a, b));
    System.out.println(o3.getResult(a, b));
    System.out.println(o4.getResult(a, b));
  }

}
