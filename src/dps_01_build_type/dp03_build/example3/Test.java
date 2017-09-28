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
 * ������<br>
 * @author Administrator
 */
public class Test extends TestCase {

  /**����һ����Ԫ����,MediaItem�����ڽ���ģʽ�Ľ�ɫ:ý�����Ԫ��(ҳ,����,��ҳ)*/
  private List<MediaItem> input = Arrays.asList(new MediaItem[] {
      new MediaItem("item1"), new MediaItem("item2"), new MediaItem("item3"),
      new MediaItem("item4"), });

  /**
   * �����鼮
   */
  public void testBook() {
    //ָ���߽�ɫ,���þ��彨���߽�ɫ�Դ�����Ʒ����
    MediaDirector buildBook = new MediaDirector(new BookBuilder());
    //�����ڽ���ģʽ�Ľ�ɫ:ý����ʽ(��ͨ),��������԰������������Ʒ��ɫ,ֻ���൱��,ʵ���Ͻ���ģʽ��û�������ɫ
    Media book = buildBook.produceMedia(input);//����ý��Ĺ���
    String result = "book: " + book;
    System.out.println(result);
    System.out.println();
    assertEquals(result, "book: [item1, item2, item3, item4]");//����result�ͺ�����ַ������
  }

  /**
   * ������־
   */
  public void testMagazine() {
    //ָ���߽�ɫ,���þ��彨���߽�ɫ�Դ�����Ʒ����
    MediaDirector buildMagazine = new MediaDirector(new MagazineBuilder());
    //�����ڽ���ģʽ�Ľ�ɫ:ý����ʽ(��ͨ),��������԰������������Ʒ��ɫ,ֻ���൱��,ʵ���Ͻ���ģʽ��û�������ɫ
    Media magazine = buildMagazine.produceMedia(input);//����ý��Ĺ���
    String result = "magazine: " + magazine;
    System.out.println(result);
    System.out.println();
    assertEquals(result, "magazine: [item1, item2, item3, item4]");//����result�ͺ�����ַ������
  }

  /**
   * ����վ��
   */
  public void testWebSite() {
    //ָ���߽�ɫ,���þ��彨���߽�ɫ�Դ�����Ʒ����
    MediaDirector buildWebSite = new MediaDirector(new WebSiteBuilder());
    //�����ڽ���ģʽ�Ľ�ɫ:ý����ʽ(��ͨ),��������԰������������Ʒ��ɫ,ֻ���൱��,ʵ���Ͻ���ģʽ��û�������ɫ
    Media webSite = buildWebSite.produceMedia(input);//����ý��Ĺ���
    String result = "web site: " + webSite;
    System.out.println(result);
    System.out.println();
    assertEquals(result, "web site: [item1, item2, item3, item4]");//����result�ͺ�����ַ������
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    TestRunner.run(Test.class);
  }

}
