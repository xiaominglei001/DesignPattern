package util;

/**
 * ��String��صĹ�����<br>
 * @author Administrator
 */
public class StringUtil {

  /**
   * ����N��unitƴ�Ӻ���ַ���,��5,"-",����"-----"<br>
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
