package dps_02_structure_type.dp04_decorator.example2;

import dps_02_structure_type.dp04_decorator.example2.component.IPerson;
import dps_02_structure_type.dp04_decorator.example2.concrete_component.Person;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.BigTrouser;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.LeatherShoes;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.Sneakers;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.Suit;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.TShirts;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.Tie;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象构件（Component）角色：人
    IPerson xc = new Person("小菜");

    System.out.println("第一种装扮:");
    //具体装饰（Concrete Decorator）角色：
    Sneakers pqx = new Sneakers();//破球鞋
    BigTrouser kk = new BigTrouser();//垮裤
    TShirts dtx = new TShirts();//体恤

    //装饰
    pqx.decorate(xc);
    kk.decorate(pqx);
    dtx.decorate(kk);
    //展示自己
    dtx.show();

    System.out.println("\n第二种装扮:");
    //具体装饰（Concrete Decorator）角色：
    LeatherShoes px = new LeatherShoes();//皮鞋
    Tie ld = new Tie();//领带
    Suit xz = new Suit();//西装

    //装饰
    px.decorate(xc);
    ld.decorate(px);
    xz.decorate(ld);
    //展示自己
    xz.show();
  }

}
