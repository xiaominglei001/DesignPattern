package dps_01_build_type.dp03_build.example1.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品角色<br>
 * @author Administrator
 */
public class Product {

  /**存储产品部件的集合*/
  private List<String> parts = new ArrayList<String>();

  /**
   * 增加一个部件<br>
   * @param part
   */
  public void add(String part) {
    parts.add(part);
  }

  /**
   * 显示自身的部件
   */
  public void show() {
    System.out.println("产品创建:");
    for (String part : parts) {
      System.out.println(part);
    }
  }

}
