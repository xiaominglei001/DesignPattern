package dps_01_build_type.dp03_build.example1.product;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ʒ��ɫ<br>
 * @author Administrator
 */
public class Product {

  /**�洢��Ʒ�����ļ���*/
  private List<String> parts = new ArrayList<String>();

  /**
   * ����һ������<br>
   * @param part
   */
  public void add(String part) {
    parts.add(part);
  }

  /**
   * ��ʾ����Ĳ���
   */
  public void show() {
    System.out.println("��Ʒ����:");
    for (String part : parts) {
      System.out.println(part);
    }
  }

}
