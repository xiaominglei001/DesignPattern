package dps_01_build_type.dp03_build.example3.builder;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * �������߽�ɫ�����淶������ý�彨��Ĳ���<br>
 * @author Administrator
 */
public interface MediaBuilder {

  /**
   * ����ý�����
   */
  public void buildBase();

  /**
   * ��ý�����׷��һ����Ԫ<br>
   * @param item
   */
  public void addMediaItem(MediaItem item);

  /**
   * ��ȡ������ý�����<br>
   * @return Media
   */
  public Media getFinishedMedia();

}
