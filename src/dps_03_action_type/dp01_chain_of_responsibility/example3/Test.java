package dps_03_action_type.dp01_chain_of_responsibility.example3;

import dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler.CommonManager;
import dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler.GeneralManager;
import dps_03_action_type.dp01_chain_of_responsibility.example3.concrete_handler.Mojordomo;
import dps_03_action_type.dp01_chain_of_responsibility.example3.handler.Manager;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //抽象处理者角色（Handler）：
    Manager jinli = new CommonManager("金利");//具体处理者角色（Concrete Handler）:经理
    Manager zongjian = new Mojordomo("宗剑");//具体处理者角色（Concrete Handler）:总监
    Manager zongjingli = new GeneralManager("钟精励");//具体处理者角色（Concrete Handler）:总经理

    //设置上级
    jinli.setSuperior(zongjian);
    zongjian.setSuperior(zongjingli);

    //设置请求细节
    Request request1 = new Request("请假", "小菜请假", 1);
    Request request2 = new Request("请假", "小菜请假", 4);
    Request request3 = new Request("加薪", "小菜请求加薪", 500);
    Request request4 = new Request("加薪", "小菜请求加薪", 1000);
    Request request5 = new Request("升官", "小菜请求升官", 99999999);

    //开始处理,请求都是由经理发起,具体由谁来决策客户端并不知道
    jinli.requestApplication(request1);
    jinli.requestApplication(request2);
    jinli.requestApplication(request3);
    jinli.requestApplication(request4);
    jinli.requestApplication(request5);
  }

}
