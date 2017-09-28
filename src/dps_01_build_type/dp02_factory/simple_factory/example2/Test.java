package dps_01_build_type.dp02_factory.simple_factory.example2;

import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_creator.OperationFactory;
import dps_01_build_type.dp02_factory.simple_factory.example2.product.Operation;

/**
 * 测试类<br>
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

    //抽象产品角色：运算
    Operation o1 = OperationFactory.createOperation("+");
    Operation o2 = OperationFactory.createOperation("-");
    Operation o3 = OperationFactory.createOperation("*");
    Operation o4 = OperationFactory.createOperation("/");

    //获取运算的结果
    System.out.println(o1.getResult(a, b));
    System.out.println(o2.getResult(a, b));
    System.out.println(o3.getResult(a, b));
    System.out.println(o4.getResult(a, b));
  }

}
