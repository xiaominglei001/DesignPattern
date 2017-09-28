package dps_01_build_type.dp03_build.example3.director;

import java.util.Iterator;
import java.util.List;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * ָ���߽�ɫ,���þ��彨���߽�ɫ�Դ�����Ʒ����<br>
 * @author Administrator
 */
public class MediaDirector {

  /**һ����������*/
  private MediaBuilder mb;

  /**
   * ���캯��<br>
   * @param mb
   */
  public MediaDirector(MediaBuilder mb) {
    this.mb = mb; //���в���ģʽ����������
  }

  /**
   * ����ý��Ĺ���,�ɽ�����ȥ���<br>
   * @param input
   * @return Media
   */
  public Media produceMedia(List<MediaItem> input) {
    //����ý����� 
    mb.buildBase();
    for (Iterator it = input.iterator(); it.hasNext();)
      //��ý�����׷��һ����Ԫ
      mb.addMediaItem((MediaItem) it.next());
    return mb.getFinishedMedia();
  }

}