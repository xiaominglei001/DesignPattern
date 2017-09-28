package dps_01_build_type.dp02_factory.factory_method.example2.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example2.concrete_product.OperationMul;
import dps_01_build_type.dp02_factory.factory_method.example2.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。<br>
 * 乘法工厂<br>
 * @author Administrator
 */
public class FactoryMul implements Factory {

  /**
   * 创建乘法运算类<br>
   * @return Operation
   */
  public Operation createOperation() {
    return new OperationMul();
  }

}
