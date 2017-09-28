package dps_01_build_type.dp03_build.example3.concrete_builder;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.Book;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * ���彨���߽�ɫ:�鼮�Ľ�����<br>
 * @author Administrator
 */
public class BookBuilder implements MediaBuilder {

  /**һ���鼮*/
  private Book b;

  /**
   * �����鼮����
   */
  public void buildBase() {
    System.out.println("Building book framework");
    b = new Book();
  }

  /**
   * ���鼮���һ����Ԫ<br>
   * @param chapter 
   */
  public void addMediaItem(MediaItem chapter) {
    System.out.println("Adding chapter " + chapter);
    b.add(chapter);
  }

  /**
   * ��ȡ�������鼮<br>
   * @return Media
   */
  public Media getFinishedMedia() {
    return b;
  }

}
