package dps_01_build_type.dp03_build.example3.concrete_builder;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.WebSite;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * ���彨���߽�ɫ:վ��Ľ�����<br>
 * @author Administrator
 */
public class WebSiteBuilder implements MediaBuilder {

  /**һ��վ��*/
  private WebSite w;

  /**
   * ����վ�����
   */
  public void buildBase() {
    System.out.println("Building web site framework");
    w = new WebSite();
  }

  /**
   * ��վ�����һ����Ԫ<br>
   * @param webItem 
   */
  public void addMediaItem(MediaItem webItem) {
    System.out.println("Adding web item " + webItem);
    w.add(webItem);
  }

  /**
   * ��ȡ������վ��<br>
   * @return Media
   */
  public Media getFinishedMedia() {
    return w;
  }

}