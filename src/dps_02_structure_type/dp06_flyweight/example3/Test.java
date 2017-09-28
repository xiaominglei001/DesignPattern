package dps_02_structure_type.dp06_flyweight.example3;

import dps_02_structure_type.dp06_flyweight.example3.flyweight.Website;
import dps_02_structure_type.dp06_flyweight.example3.flyweight_factory.WebsiteFactory;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //享元工厂(FlyweightFactory)角色:这里是网站的储藏室
    WebsiteFactory f = new WebsiteFactory();

    //抽象享元(Flyweight)角色:这里是网站
    Website fx = f.getWebsiteCategory("产品展示");
    Website fy = f.getWebsiteCategory("产品展示");
    Website fz = f.getWebsiteCategory("产品展示");
    Website fl = f.getWebsiteCategory("博客");
    Website fm = f.getWebsiteCategory("博客");
    Website fn = f.getWebsiteCategory("博客");

    //使用
    fx.use(new User("小菜"));
    fy.use(new User("大鸟"));
    fz.use(new User("娇娇"));
    fl.use(new User("老顽童"));
    fm.use(new User("桃谷六仙"));
    fn.use(new User("南海鳄神"));

    //网站的总数
    System.out.println("得到网站分类总数为 " + f.websiteCount());
  }

}
