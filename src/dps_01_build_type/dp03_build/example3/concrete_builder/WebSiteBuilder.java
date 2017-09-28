package dps_01_build_type.dp03_build.example3.concrete_builder;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.WebSite;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * 具体建造者角色:站点的建造者<br>
 * @author Administrator
 */
public class WebSiteBuilder implements MediaBuilder {

  /**一个站点*/
  private WebSite w;

  /**
   * 创建站点对象
   */
  public void buildBase() {
    System.out.println("Building web site framework");
    w = new WebSite();
  }

  /**
   * 给站点添加一个单元<br>
   * @param webItem 
   */
  public void addMediaItem(MediaItem webItem) {
    System.out.println("Adding web item " + webItem);
    w.add(webItem);
  }

  /**
   * 获取完整的站点<br>
   * @return Media
   */
  public Media getFinishedMedia() {
    return w;
  }

}