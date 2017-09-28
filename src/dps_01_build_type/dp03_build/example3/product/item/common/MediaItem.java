package dps_01_build_type.dp03_build.example3.product.item.common;

/**
 * 不属于建造模式的角色:媒体组成元素(页,剪辑,网页)<br> 
 * @author Administrator
 */
public class MediaItem {

  /**用个简单的字符串表示组成元素的内容*/
  private String content;

  /**
   * 构造函数<br>
   * @param content
   */
  public MediaItem(String content) {
    this.content = content;
  }

  /**
   * @return String
   */
  public String toString() {
    return content;
  }

}
