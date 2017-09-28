package dps_02_structure_type.dp06_flyweight.example1;

import dps_02_structure_type.dp06_flyweight.example1.concrete_flyweight.UnsharedConcreteFlyweight;
import dps_02_structure_type.dp06_flyweight.example1.flyweight.Flyweight;
import dps_02_structure_type.dp06_flyweight.example1.flyweight_factory.FlyweightFactory;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //外部状态
    int extrinsicstate = 22;
    
    //享元工厂(FlyweightFactory)角色
    FlyweightFactory f = new FlyweightFactory();
    
    //抽象享元(Flyweight)角色:需要共享的子类(x,y,z)
    Flyweight fx = f.getFlyweight("x");
    Flyweight fy = f.getFlyweight("y");
    Flyweight fz = f.getFlyweight("z");

    //抽象享元(Flyweight)角色:不需要共享的子类
    Flyweight uf = new UnsharedConcreteFlyweight();

    //执行操作
    fx.operation(--extrinsicstate);
    fy.operation(--extrinsicstate);
    fz.operation(--extrinsicstate);
    uf.operation(--extrinsicstate);
  }

}
