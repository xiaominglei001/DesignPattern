package dps_03_action_type.dp05_mediator.example2;

import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Landlord1;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Landlord2;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Lodger1;
import dps_03_action_type.dp05_mediator.example2.concrete_colleague.Lodger2;
import dps_03_action_type.dp05_mediator.example2.concrete_mediator.ConcreteMediator;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体调停者也称中介者（ConcreteMediator）角色:房产中介
    ConcreteMediator m = new ConcreteMediator();

    //具体同事对象角色（ConcreteColleague）：让四个具体的同事认识房产中介
    Landlord1 d1 = new Landlord1(m);
    Landlord2 d2 = new Landlord2(m);
    Lodger1 r1 = new Lodger1(m);
    Lodger2 r2 = new Lodger2(m);

    //让房产中介认识各个具体同事类对象
    m.setLandlord1(d1);
    m.setLandlord2(d2);
    m.setLodger1(r1);
    m.setLodger2(r2);

    //具体同事类对象的发送信息都是通过房产中介转发
    d1.send("我是房东1,我有好房出租.");
    d2.send("我是房东2,我有垃圾房出租.");

    r1.send("我是房客1,你是中介吗,中介勿扰!");
    r1.send("我是房客2,你有病啊,垃圾房谁租?");
  }

}
