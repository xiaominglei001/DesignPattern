package dps_01_build_type.dp02_factory.factory_method.example2.creator;

import dps_01_build_type.dp02_factory.factory_method.example2.product.Operation;

/**
 * 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。<br>
 * 声明创建运算的实例<br>
 * @author Administrator
 */
public interface Factory {

  /**
   * 创建运算类<br>
   * @return Operation
   */
  public Operation createOperation();

}
