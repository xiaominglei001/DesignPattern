package dps_01_build_type.dp02_factory.simple_factory.example3.concrete_creator;

import dps_01_build_type.dp02_factory.simple_factory.example3.concrete_product.Undergraduate;
import dps_01_build_type.dp02_factory.simple_factory.example3.concrete_product.Volunteer;
import dps_01_build_type.dp02_factory.simple_factory.example3.product.LeiFeng;

/**
 * 具体工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑。<br>
 * 简单工厂模式中没有抽象工厂角色<br>
 * 创建学雷锋xx的工厂<br>
 * @author Administrator
 */
public class LeiFengFactory {

  /**
   * 创建学雷锋的志愿者<br>
   * @param type 
   * @return LeiFeng
   * @throws Exception 
   */
  public static LeiFeng createLeiFeng(int type) throws Exception {
    //假设(1:学生 2:志愿者)
    switch (type) {
    case 1:
      return new Undergraduate();//创建学雷锋的学生
    case 2:
      return new Volunteer();//创建学雷锋的志愿者
    default:
      throw new Exception("不支持的雷锋类型.");
    }
  }

}