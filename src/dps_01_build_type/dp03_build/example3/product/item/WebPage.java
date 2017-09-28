package dps_01_build_type.dp03_build.example3.product.item;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;

/**
 * 不属于建造模式的角色:站点的组成元素(网页)<br> 
 * @author Administrator
 */
public class WebPage extends MediaItem {

  /**
   * 构造函数<br>
   * @param content
   */
  public WebPage(String content) {
    super(content);
  }

}
