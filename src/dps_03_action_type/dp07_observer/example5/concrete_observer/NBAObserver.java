package dps_03_action_type.dp07_observer.example5.concrete_observer;

/**
 * 具体观察者角色:喜欢看NBA的员工<br>
 * 在实际应用中,观察者可能是别人已经写好的类,无法对其进行改变,更别说让其实现通用接口Observer,<br>
 * 所以这里只是一个普通的类,C#中用委托来解决这个问题,这里在Secretary中用反射来调用<br>
 * @author Administrator
 */
public class NBAObserver {

  /**
   * 改变自己状态的方法
   * @param action 
   */
  public void updateNBAObserver(String action) {
    System.out.println(action + ",关闭NBA直播,继续工作!");
  }

}
