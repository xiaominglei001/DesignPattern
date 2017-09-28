package dps_01_build_type.dp02_factory.factory_method.example3.concrete_creator;

import dps_01_build_type.dp02_factory.factory_method.example3.concrete_product.Undergraduate;
import dps_01_build_type.dp02_factory.factory_method.example3.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example3.product.LeiFeng;

/**
 * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。<br>
 * 创建学雷锋学生的工厂<br>
 * @author Administrator
 */
public class FactoryUndergraduate implements Factory {

  /**
   * 创建学雷锋的学生<br>
   * @return LeiFeng
   */
  public LeiFeng createLeiFeng() {
    return new Undergraduate();
  }

}
