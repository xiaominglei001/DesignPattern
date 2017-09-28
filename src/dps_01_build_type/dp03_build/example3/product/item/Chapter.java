package dps_01_build_type.dp03_build.example3.product.item;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;

/**
 * 不属于建造模式的角色:书籍的组成元素(章节)<br> 
 * @author Administrator
 */
public class Chapter extends MediaItem {

  /**
   * 构造函数<br>
   * @param content
   */
  public Chapter(String content) {
    super(content);
  }

}
