package dps_01_build_type.dp03_build.example3.director;

import java.util.Iterator;
import java.util.List;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * 指导者角色,调用具体建造者角色以创建产品对象<br>
 * @author Administrator
 */
public class MediaDirector {

  /**一个抽象建造者*/
  private MediaBuilder mb;

  /**
   * 构造函数<br>
   * @param mb
   */
  public MediaDirector(MediaBuilder mb) {
    this.mb = mb; //具有策略模式的相似特征
  }

  /**
   * 制造媒体的过程,由建造者去完成<br>
   * @param input
   * @return Media
   */
  public Media produceMedia(List<MediaItem> input) {
    //创建媒体对象 
    mb.buildBase();
    for (Iterator it = input.iterator(); it.hasNext();)
      //给媒体对象追加一个单元
      mb.addMediaItem((MediaItem) it.next());
    return mb.getFinishedMedia();
  }

}