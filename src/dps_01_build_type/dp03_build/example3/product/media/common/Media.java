package dps_01_build_type.dp03_build.example3.product.media.common;

import java.util.List;
import java.util.ArrayList;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;

/**
 * �����ڽ���ģʽ�Ľ�ɫ:ý����ʽ(��ͨ)<br>
 * ��������԰������������Ʒ��ɫ,ֻ���൱��,ʵ���Ͻ���ģʽ��û�������ɫ<br>
 * @author Administrator
 */
public abstract class Media {

  /**һ��ý����ʽ���ܰ��������Ԫ(ҳ,����,��ҳ)*/
  private List<MediaItem> list;

  /**
   * ���캯��
   */
  public Media() {
    list = new ArrayList<MediaItem>();
  }

  /**
   * ��ý����ʽ׷��һ����Ԫ(ҳ,����,��ҳ)
   * @param obj
   */
  public void add(MediaItem obj) {
    list.add(obj);
  }

  /**
   * ����һ��ý����ʽ�Ĵ�<br>
   * @return String
   */
  public String toString() {
    return list.toString();
  }

}