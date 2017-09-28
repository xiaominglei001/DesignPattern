package dps_01_build_type.dp02_factory.simple_factory.example2.concrete_creator;

import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationAdd;
import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationDiv;
import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationMul;
import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationSub;
import dps_01_build_type.dp02_factory.simple_factory.example2.product.Operation;

/**
 * 具体工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑。<br>
 * 简单工厂模式中没有抽象工厂角色<br>
 * @author Administrator
 */
public class OperationFactory {

  /**
   * @param operator
   * @return Operation
   * @throws Exception
   */
  public static Operation createOperation(String operator) throws Exception {
    char c = operator.charAt(0);
    Operation oper = null;
    switch (c) {
    case '+':
      oper = new OperationAdd();//加法
      break;
    case '-':
      oper = new OperationSub();//减法
      break;
    case '*':
      oper = new OperationMul();//乘法
      break;
    case '/':
      oper = new OperationDiv();//除法
      break;
    default:
      throw new Exception("不支持的运算符号.");
    }
    return oper;
  }

}
