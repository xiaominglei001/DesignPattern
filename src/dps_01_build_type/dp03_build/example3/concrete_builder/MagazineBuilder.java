package dps_01_build_type.dp03_build.example3.concrete_builder;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.Magazine;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * 具体建造者角色:杂志的建造者<br>
 * @author Administrator
 */
public class MagazineBuilder implements MediaBuilder {

  /**一本杂志*/
  private Magazine m;

  /**
   * 创建杂志对象
   */
  public void buildBase() {
    System.out.println("Building magazine framework");
    m = new Magazine();
  }

  /**
   * 给杂志添加一个单元<br>
   * @param article 
   */
  public void addMediaItem(MediaItem article) {
    System.out.println("Adding article " + article);
    m.add(article);
  }

  /**
   * 获取完整的杂志<br>
   * @return Media
   */
  public Media getFinishedMedia() {
    return m;
  }
  
}
