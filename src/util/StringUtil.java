package util;

/**
 * 与String相关的工具类<br>
 * @author Administrator
 */
public class StringUtil {

  /**
   * 返回N个unit拼接后的字符串,如5,"-",返回"-----"<br>
   * @param unit 
   * @param depth 
   * @return String
   */
  public static String join(String unit, int depth) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < depth; i++) {
      sb.append(unit);
    }
    return sb.toString();
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(join("&", 10));
  }

}
