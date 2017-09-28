package dps_02_structure_type.dp06_flyweight.example2;

import dps_02_structure_type.dp06_flyweight.example2.flyweight.AbsFood;
import dps_02_structure_type.dp06_flyweight.example2.flyweight_factory.Storage;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //享元工厂(FlyweightFactory)角色:菜的储藏室
    Storage s = new Storage();

    //抽象享元(Flyweight)角色:食物
    AbsFood food1 = s.getFood("农家小炒");
    AbsFood food2 = s.getFood("农家小炒");
    AbsFood food3 = s.getFood("干煸刀豆");

    //从运行结果可以看出food1和food2是相同的对象
    food1.display();
    food2.display();
    food3.display();
  }

}
