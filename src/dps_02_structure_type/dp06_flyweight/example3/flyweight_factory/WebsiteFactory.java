package dps_02_structure_type.dp06_flyweight.example3.flyweight_factory;

import java.util.Hashtable;

import dps_02_structure_type.dp06_flyweight.example3.concrete_flyweight.ConcreteWebsite;
import dps_02_structure_type.dp06_flyweight.example3.flyweight.Website;

/**
 * 享元工厂(FlyweightFactory)角色:本角色负责创建和管理享元角色.<br>
 * 这里是网站的储藏室<br>
 * @author Administrator
 */
public class WebsiteFactory {

  private Hashtable<String, Website> flyweights = new Hashtable<String, Website>();

  /**
   * 根据key获取网站<br>
   * 这里方法不需要同步,因为Hashtable是线程安全的<br>
   * @param key 
   * @return Website
   */
  public Website getWebsiteCategory(String key) {
    if (flyweights.containsKey(key)) {
      //do nothing
    } else {
      flyweights.put(key, new ConcreteWebsite(key));
    }
    return flyweights.get(key);
  }

  /**
   * 获取网站的总数<br>
   * @return int
   */
  public int websiteCount() {
    return flyweights.size();
  }

}
