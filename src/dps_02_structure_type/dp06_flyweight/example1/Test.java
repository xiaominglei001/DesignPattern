package dps_02_structure_type.dp06_flyweight.example1;

import dps_02_structure_type.dp06_flyweight.example1.concrete_flyweight.UnsharedConcreteFlyweight;
import dps_02_structure_type.dp06_flyweight.example1.flyweight.Flyweight;
import dps_02_structure_type.dp06_flyweight.example1.flyweight_factory.FlyweightFactory;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�ⲿ״̬
    int extrinsicstate = 22;
    
    //��Ԫ����(FlyweightFactory)��ɫ
    FlyweightFactory f = new FlyweightFactory();
    
    //������Ԫ(Flyweight)��ɫ:��Ҫ���������(x,y,z)
    Flyweight fx = f.getFlyweight("x");
    Flyweight fy = f.getFlyweight("y");
    Flyweight fz = f.getFlyweight("z");

    //������Ԫ(Flyweight)��ɫ:����Ҫ���������
    Flyweight uf = new UnsharedConcreteFlyweight();

    //ִ�в���
    fx.operation(--extrinsicstate);
    fy.operation(--extrinsicstate);
    fz.operation(--extrinsicstate);
    uf.operation(--extrinsicstate);
  }

}
