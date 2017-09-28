package dps_01_build_type.dp03_build.example3.builder;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * 抽象建造者角色，它规范了所有媒体建造的步骤<br>
 * @author Administrator
 */
public interface MediaBuilder {

  /**
   * 创建媒体对象
   */
  public void buildBase();

  /**
   * 给媒体对象追加一个单元<br>
   * @param item
   */
  public void addMediaItem(MediaItem item);

  /**
   * 获取完整的媒体对象<br>
   * @return Media
   */
  public Media getFinishedMedia();

}
