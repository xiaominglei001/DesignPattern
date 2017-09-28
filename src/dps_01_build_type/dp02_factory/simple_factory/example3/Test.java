package dps_01_build_type.dp02_factory.simple_factory.example3;

import dps_01_build_type.dp02_factory.simple_factory.example3.concrete_creator.LeiFengFactory;
import dps_01_build_type.dp02_factory.simple_factory.example3.product.LeiFeng;

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
    System.out.println("学生:");
    //抽象产品角色：雷锋,假设(1:学生 2:志愿者)
    LeiFeng student = LeiFengFactory.createLeiFeng(1);//创建学雷锋xx的工厂
    //具体行为:买米,扫地,洗衣
    student.buyRice();
    student.sweep();
    student.wash();
    System.out.println("\n");

    System.out.println("志愿者:");
    //抽象产品角色：雷锋,假设(1:学生 2:志愿者)
    LeiFeng volunteer = LeiFengFactory.createLeiFeng(2);//创建学雷锋xx的工厂
    //具体行为:买米,扫地,洗衣
    volunteer.buyRice();
    volunteer.sweep();
    volunteer.wash();
  }

}
