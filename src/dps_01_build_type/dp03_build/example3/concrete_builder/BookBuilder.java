package dps_01_build_type.dp03_build.example3.concrete_builder;

import dps_01_build_type.dp03_build.example3.builder.MediaBuilder;
import dps_01_build_type.dp03_build.example3.product.item.common.MediaItem;
import dps_01_build_type.dp03_build.example3.product.media.Book;
import dps_01_build_type.dp03_build.example3.product.media.common.Media;

/**
 * 具体建造者角色:书籍的建造者<br>
 * @author Administrator
 */
public class BookBuilder implements MediaBuilder {

  /**一本书籍*/
  private Book b;

  /**
   * 创建书籍对象
   */
  public void buildBase() {
    System.out.println("Building book framework");
    b = new Book();
  }

  /**
   * 给书籍添加一个单元<br>
   * @param chapter 
   */
  public void addMediaItem(MediaItem chapter) {
    System.out.println("Adding chapter " + chapter);
    b.add(chapter);
  }

  /**
   * 获取完整的书籍<br>
   * @return Media
   */
  public Media getFinishedMedia() {
    return b;
  }

}
