package dps_01_build_type.dp03_build.example3.product.item;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;

/**
 * 不属于建造模式的角色:杂志的组成元素(文章)<br> 
 * @author Administrator
 */
public class Article extends MediaItem {

  /**
   * 构造函数<br>
   * @param content
   */
  public Article(String content) {
    super(content);
  }

}
