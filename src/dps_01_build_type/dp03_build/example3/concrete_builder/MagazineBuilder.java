package dps_01_build_type.dp03_build.example3.concrete_builder;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.Magazine;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * ���彨���߽�ɫ:��־�Ľ�����<br>
 * @author Administrator
 */
public class MagazineBuilder implements MediaBuilder {

  /**һ����־*/
  private Magazine m;

  /**
   * ������־����
   */
  public void buildBase() {
    System.out.println("Building magazine framework");
    m = new Magazine();
  }

  /**
   * ����־���һ����Ԫ<br>
   * @param article 
   */
  public void addMediaItem(MediaItem article) {
    System.out.println("Adding article " + article);
    m.add(article);
  }

  /**
   * ��ȡ��������־<br>
   * @return Media
   */
  public Media getFinishedMedia() {
    return m;
  }
  
}
