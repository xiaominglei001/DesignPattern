package dps_02_structure_type.dp02_bridge.example2;

import dps_02_structure_type.dp02_bridge.example2.abstraction.Drink;
import dps_02_structure_type.dp02_bridge.example2.concrete_implementor.PutMilk;
import dps_02_structure_type.dp02_bridge.example2.concrete_implementor.PutSugar;
import dps_02_structure_type.dp02_bridge.example2.implementor.Action;
import dps_02_structure_type.dp02_bridge.example2.refined_abstraction.Coke;
import dps_02_structure_type.dp02_bridge.example2.refined_abstraction.LargeCoffee;
import dps_02_structure_type.dp02_bridge.example2.refined_abstraction.MiddleCoffee;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //行为接口:加xx
    Action amilk = new PutMilk();
    Action asugar = new PutSugar();

    //大杯咖啡加奶
    Drink d1 = new LargeCoffee();
    d1.setAction(amilk);
    d1.makeDrink();
    //大杯咖啡加糖
    Drink d2 = new LargeCoffee();
    d2.setAction(asugar);
    d2.makeDrink();

    //中杯咖啡加奶
    Drink d3 = new MiddleCoffee();
    d3.setAction(amilk);
    d3.makeDrink();
    //中杯咖啡加糖
    Drink d4 = new MiddleCoffee();
    d4.setAction(asugar);
    d4.makeDrink();

    //可乐加奶
    Drink d5 = new Coke();
    d5.setAction(amilk);
    d5.makeDrink();
    //可乐加糖
    Drink d6 = new Coke();
    d6.setAction(asugar);
    d6.makeDrink();
  }

}
