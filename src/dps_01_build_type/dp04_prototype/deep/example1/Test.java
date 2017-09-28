package dps_01_build_type.dp04_prototype.deep.example1;

import util.ClassUtil;
import dps_01_build_type.dp04_prototype.deep.example1.concrete_prototype.AppleComputer;
import dps_01_build_type.dp04_prototype.deep.example1.prototype.Computer;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  @SuppressWarnings("deprecation")
  public static void main(String[] args) throws Exception {
    //抽象原型角色:计算机
    Computer apple = new AppleComputer();
    Computer apple2 = apple.clone();//克隆自身
    Computer apple3 = apple.clone();//克隆自身
    //这里为了说明问题,调用一个不推荐使用的方法对apple2.produceDate进行重新设置,因为Computer.clone()
    //使用使用的是深克隆,所以apple2.produceDate的改变不会影响到apple.produceDate和apple3.produceDate
    //注意打印结果中的日期(三个日期并不完全相等)
    apple2.getProduceDate().setYear(1000);

    //打印出对象的各个属性值
    ClassUtil.display(apple);
    ClassUtil.display(apple2);
    ClassUtil.display(apple3);
  }

}
