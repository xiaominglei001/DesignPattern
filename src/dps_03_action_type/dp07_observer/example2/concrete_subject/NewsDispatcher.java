package dps_03_action_type.dp07_observer.example2.concrete_subject;

import java.util.Observable;

//Observable和Observer的说明： 
//继承于Observable的子类表示被观察的对象，实现了接口Observer的类表示观察者.
//在下面的例子中继承于Observable的子类NewsDispatcher(新闻派发器)表示被观察的对象，
//在有新的新闻的时候会把新闻内容派发给所有的订阅者(Reader),Reader是实现了Observer接口的类表示读者。 

//Observable的简单功能介绍： 
//addObserver(Observer o)  添加观察着 
//clearChanged() 清除变化，则把“变化标志”设为false 
//countObservers() 统计观察着数量 
//deleteObserver(Observer o) 删除观察者 
//deleteObservers() 删除所有的观察者 
//hasChanged() 测试是否有变化(则返回“变化标志”) 
//notifyObservers() 如果hasChanged()=ture，通知所有的观察着(则调用Observer.update()方法) 
//notifyObservers(Object arg) 如果hasChanged()=ture，通知所有的观察着(则调用Observer.update()方法),并把参数arg传过去 
//setChanged() 设置变化，则把“变化标志”设为true 

/**
 * 具体主题（或可观察者）角色:新闻派发器，当有新的新闻时派发给所有的订阅读者<br>
 * @author Administrator
 */
public class NewsDispatcher extends Observable {

  /**  
   * 添加新闻的时候，把新闻内容发给所有的定义者  
   * @param news  
   */
  public void addNews(String news) {
    this.setChanged();
    this.notifyObservers(news);
  }

}
