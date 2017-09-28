package dps_03_action_type.dp05_mediator.example1;

import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague1;
import dps_03_action_type.dp05_mediator.example1.concrete_colleague.ConcreteColleague2;
import dps_03_action_type.dp05_mediator.example1.concrete_mediator.ConcreteMediator;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体调停者也称中介者（ConcreteMediator）角色:具体中介者
    ConcreteMediator m = new ConcreteMediator();

    //具体同事对象角色（ConcreteColleague）：让两个具体的同事认识中介者对象
    ConcreteColleague1 c1 = new ConcreteColleague1(m);
    ConcreteColleague2 c2 = new ConcreteColleague2(m);

    //让中介者认识各个具体同事类对象
    m.setColleague1(c1);
    m.setColleague2(c2);

    //具体同事类对象的发送信息都是通过中介者转发
    c1.send("吃过饭了吗？");
    c2.send("没有呢，你打算请客?");
  }

}
