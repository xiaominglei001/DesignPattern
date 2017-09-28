package dps_03_action_type.dp07_observer.example5;

import dps_03_action_type.dp07_observer.example5.concrete_observer.NBAObserver;
import dps_03_action_type.dp07_observer.example5.concrete_observer.StockObserver;
import dps_03_action_type.dp07_observer.example5.concrete_subject.Secretary;
import dps_03_action_type.dp07_observer.example5.subject.Subject;

/**
 * 测试类<br>
 * 在实际应用中,观察者可能是别人已经写好的类,无法对其进行改变,更别说让其实现通用接口Observer,
 * 也就是说这里没有抽象观察者角色,但是仍然要通知观察者,但不能通过接口调用update了,
 * C#中用委托来解决这个问题,这里在Secretary中用反射来调用
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   * @throws NoSuchMethodException 
   * @throws SecurityException 
   */
  public static void main(String[] args) throws Exception {
    //抽象主题（或可观察者）角色:前台
    Subject subject = new Secretary();

    //具体观察者角色
    Object observer1 = new NBAObserver();//喜欢看NBA的员工
    Object observer2 = new StockObserver();//喜欢看股市行情的员工

    //把委托的类绑定给代理类,这里的意思是,当调用subject.notify_通知大家时,
    //希望主题角色通过调用observer1.updateNBAObserver
    //和observer2.updateStock来发出通知,但是这两个类并没有实现统一接口,所以要用反射来做
    subject.bind(observer1, observer1.getClass().getMethod("updateNBAObserver",
        String.class));
    subject.bind(observer2, observer2.getClass().getMethod("updateStock",
        String.class));

    //通知大家
    subject.notify_("老板回来了");
  }

}
