package dps_01_build_type.dp03_build.example3.product.item.common;

/**
 * �����ڽ���ģʽ�Ľ�ɫ:ý�����Ԫ��(ҳ,����,��ҳ)<br> 
 * @author Administrator
 */
public class MediaItem {

  /**�ø��򵥵��ַ�����ʾ���Ԫ�ص�����*/
  private String content;

  /**
   * ���캯��<br>
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
