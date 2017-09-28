package dps_02_structure_type.dp02_bridge.example2;

import dps_02_structure_type.dp02_bridge.example2.abstraction.Drink;
import dps_02_structure_type.dp02_bridge.example2.concrete_implementor.PutMilk;
import dps_02_structure_type.dp02_bridge.example2.concrete_implementor.PutSugar;
import dps_02_structure_type.dp02_bridge.example2.implementor.Action;
import dps_02_structure_type.dp02_bridge.example2.refined_abstraction.Coke;
import dps_02_structure_type.dp02_bridge.example2.refined_abstraction.LargeCoffee;
import dps_02_structure_type.dp02_bridge.example2.refined_abstraction.MiddleCoffee;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //��Ϊ�ӿ�:��xx
    Action amilk = new PutMilk();
    Action asugar = new PutSugar();

    //�󱭿��ȼ���
    Drink d1 = new LargeCoffee();
    d1.setAction(amilk);
    d1.makeDrink();
    //�󱭿��ȼ���
    Drink d2 = new LargeCoffee();
    d2.setAction(asugar);
    d2.makeDrink();

    //�б����ȼ���
    Drink d3 = new MiddleCoffee();
    d3.setAction(amilk);
    d3.makeDrink();
    //�б����ȼ���
    Drink d4 = new MiddleCoffee();
    d4.setAction(asugar);
    d4.makeDrink();

    //���ּ���
    Drink d5 = new Coke();
    d5.setAction(amilk);
    d5.makeDrink();
    //���ּ���
    Drink d6 = new Coke();
    d6.setAction(asugar);
    d6.makeDrink();
  }

}
