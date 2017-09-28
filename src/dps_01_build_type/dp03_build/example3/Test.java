package dps_01_build_type.dp03_build.example3;

import java.util.Arrays;
import java.util.List;

import dps_01_build_type.dp03_build.example3.concrete_builder.BookBuilder;
import dps_01_build_type.dp03_build.example3.concrete_builder.MagazineBuilder;
import dps_01_build_type.dp03_build.example3.concrete_builder.WebSiteBuilder;
import dps_01_build_type.dp03_build.example3.director.MediaDirector;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test extends TestCase {

  /**定义一个单元数组,MediaItem不属于建造模式的角色:媒体组成元素(页,剪辑,网页)*/
  private List<MediaItem> input = Arrays.asList(new MediaItem[] {
      new MediaItem("item1"), new MediaItem("item2"), new MediaItem("item3"),
      new MediaItem("item4"), });

  /**
   * 测试书籍
   */
  public void testBook() {
    //指导者角色,调用具体建造者角色以创建产品对象
    MediaDirector buildBook = new MediaDirector(new BookBuilder());
    //不属于建造模式的角色:媒体形式(共通),这里你可以把它看作抽象产品角色,只是相当于,实际上建造模式中没有这个角色
    Media book = buildBook.produceMedia(input);//制造媒体的过程
    String result = "book: " + book;
    System.out.println(result);
    System.out.println();
    assertEquals(result, "book: [item1, item2, item3, item4]");//断言result和后面的字符串相等
  }

  /**
   * 测试杂志
   */
  public void testMagazine() {
    //指导者角色,调用具体建造者角色以创建产品对象
    MediaDirector buildMagazine = new MediaDirector(new MagazineBuilder());
    //不属于建造模式的角色:媒体形式(共通),这里你可以把它看作抽象产品角色,只是相当于,实际上建造模式中没有这个角色
    Media magazine = buildMagazine.produceMedia(input);//制造媒体的过程
    String result = "magazine: " + magazine;
    System.out.println(result);
    System.out.println();
    assertEquals(result, "magazine: [item1, item2, item3, item4]");//断言result和后面的字符串相等
  }

  /**
   * 测试站点
   */
  public void testWebSite() {
    //指导者角色,调用具体建造者角色以创建产品对象
    MediaDirector buildWebSite = new MediaDirector(new WebSiteBuilder());
    //不属于建造模式的角色:媒体形式(共通),这里你可以把它看作抽象产品角色,只是相当于,实际上建造模式中没有这个角色
    Media webSite = buildWebSite.produceMedia(input);//制造媒体的过程
    String result = "web site: " + webSite;
    System.out.println(result);
    System.out.println();
    assertEquals(result, "web site: [item1, item2, item3, item4]");//断言result和后面的字符串相等
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    TestRunner.run(Test.class);
  }

}
