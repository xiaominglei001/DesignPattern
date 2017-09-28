package dps_03_action_type.dp05_mediator.example3;

import dps_03_action_type.dp05_mediator.example3.concrete_colleague.USA;
import dps_03_action_type.dp05_mediator.example3.concrete_colleague.Iraq;
import dps_03_action_type.dp05_mediator.example3.concrete_mediator.UnitedNationsSecurityCouncil;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //具体调停者也称中介者（ConcreteMediator）角色:联合国安全理事会
    UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();

    //具体同事对象角色（ConcreteColleague）：让两个具体的同事认识中介者对象
    USA usa = new USA(unsc);//美国
    Iraq iraq = new Iraq(unsc);//伊拉克

    //让中介者认识各个具体同事类对象
    unsc.setColleague1(usa);
    unsc.setColleague2(iraq);

    //具体同事类对象的发送信息都是通过中介者转发
    usa.declare("不准研制核武器，否则要发动战争。");
    iraq.declare("我们没有核武器，也不怕侵略。");
  }

}
