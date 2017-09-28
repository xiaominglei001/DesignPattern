package dps_01_build_type.dp03_build.example3.product.media.common;

import java.util.List;
import java.util.ArrayList;

import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;

/**
 * 不属于建造模式的角色:媒体形式(共通)<br>
 * 这里你可以把它看作抽象产品角色,只是相当于,实际上建造模式中没有这个角色<br>
 * @author Administrator
 */
public abstract class Media {

  /**一个媒体形式可能包含多个单元(页,剪辑,网页)*/
  private List<MediaItem> list;

  /**
   * 构造函数
   */
  public Media() {
    list = new ArrayList<MediaItem>();
  }

  /**
   * 给媒体形式追加一个单元(页,剪辑,网页)
   * @param obj
   */
  public void add(MediaItem obj) {
    list.add(obj);
  }

  /**
   * 返回一个媒体形式的串<br>
   * @return String
   */
  public String toString() {
    return list.toString();
  }

}