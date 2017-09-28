package dps_02_structure_type.dp06_flyweight.example3.flyweight_factory;

import java.util.Hashtable;

import dps_02_structure_type.dp06_flyweight.example3.concrete_flyweight.ConcreteWebsite;
import dps_02_structure_type.dp06_flyweight.example3.flyweight.Website;

/**
 * ��Ԫ����(FlyweightFactory)��ɫ:����ɫ���𴴽��͹�����Ԫ��ɫ.<br>
 * ��������վ�Ĵ�����<br>
 * @author Administrator
 */
public class WebsiteFactory {

  private Hashtable<String, Website> flyweights = new Hashtable<String, Website>();

  /**
   * ����key��ȡ��վ<br>
   * ���﷽������Ҫͬ��,��ΪHashtable���̰߳�ȫ��<br>
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
   * ��ȡ��վ������<br>
   * @return int
   */
  public int websiteCount() {
    return flyweights.size();
  }

}
