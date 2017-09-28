package dps_01_build_type.dp02_factory.factory_method.example3;

import dps_01_build_type.dp02_factory.factory_method.example3.concrete_creator.FactoryUndergraduate;
import dps_01_build_type.dp02_factory.factory_method.example3.concrete_creator.FactoryVolunteer;
import dps_01_build_type.dp02_factory.factory_method.example3.creator.Factory;
import dps_01_build_type.dp02_factory.factory_method.example3.product.LeiFeng;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("学生:");
    //抽象工厂角色：生产雷锋的抽象方法
    Factory factory1 = new FactoryUndergraduate();//创建学雷锋学生的工厂
    //抽象产品角色：雷锋
    LeiFeng student = factory1.createLeiFeng();//创建学雷锋的学生
    //具体行为:买米,扫地,洗衣
    student.buyRice();
    student.sweep();
    student.wash();
    System.out.println("\n");

    System.out.println("志愿者:");
    //抽象工厂角色：生产雷锋的抽象方法
    Factory factory2 = new FactoryVolunteer();//创建学雷锋志愿者的工厂
    //抽象产品角色：雷锋
    LeiFeng volunteer = factory2.createLeiFeng();//创建学雷锋的志愿者
    //具体行为:买米,扫地,洗衣
    volunteer.buyRice();
    volunteer.sweep();
    volunteer.wash();
  }

}
