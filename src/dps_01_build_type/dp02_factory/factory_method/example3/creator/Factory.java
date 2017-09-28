package dps_01_build_type.dp02_factory.factory_method.example3.creator;

import dps_01_build_type.dp02_factory.factory_method.example3.product.LeiFeng;

/**
 * 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。<br>
 * 声明生产雷锋的抽象方法<br>
 * @author Administrator
 *
 */
public interface Factory {

  /**
   * 生产雷锋<br>
   * @return LeiFeng
   */
  public LeiFeng createLeiFeng();

}
