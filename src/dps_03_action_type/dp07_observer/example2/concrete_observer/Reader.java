package dps_03_action_type.dp07_observer.example2.concrete_observer;

import java.util.Observable;
import java.util.Observer;

//Observer的简单功能介绍 
//update(Observable o, Object arg) Observer唯一的方法，在被通知时被Observable调用 
/**
 * 具体观察者角色:读者,阅读新闻<br>
 * @author Administrator
 */
public class Reader implements Observer {

  /**观察者的名字*/
  private String name;

  /**
   * 构造函数<br>
   * @param name
   */
  public Reader(String name) {
    this.name = name;
  }

  /**
   * 观察者更新自身状态<br>
   * @param o 
   * @param arg 
   */
  @Override
  public void update(@SuppressWarnings("unused") Observable o, Object arg) {
    String news = (String) arg;
    System.out.println(name + " : " + news);
  }

}
