package dps_02_structure_type.dp03_composite.sheer.example2;

import java.util.List;

import dps_02_structure_type.dp03_composite.sheer.example2.component.AbsFile;
import dps_02_structure_type.dp03_composite.sheer.example2.composite.Folder;
import dps_02_structure_type.dp03_composite.sheer.example2.leaf.File;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //构造一个树形的文件/目录结构
    //树干:文件夹
    Folder root = new Folder("C:\\");
    Folder folder1 = new Folder("folder1");
    Folder folder2 = new Folder("folder2");

    //增加孩子
    root.addChild(folder1);
    root.addChild(folder2);

    //叶子:文件
    File file1 = new File("Test.java");
    File file2 = new File("Test2.java");

    //增加孩子
    folder2.addChild(file1);
    folder2.addChild(file2);

    //从root访问整个对象群
    printTree(root);
    System.out.println();

    printTree(new File("OneWord.java"));
    System.out.println();

    printTree(null);
  }

  /**
   * 打印出树的信息<br>
   * @param ifile
   */
  private static void printTree(AbsFile ifile) {
    //树为空打印出null
    if (ifile == null) {
      System.out.println("null");
      return;
    } else if (ifile instanceof File) {
      //是文件打印出文件名
      ifile.printName();
      return;
    } else {
      //是文件夹打印出文件夹名
      ifile.printName();
      //获取出文件夹下所有文件后遍历,并递归调用自身
      List<AbsFile> children = ifile.getChildren();
      for (AbsFile file : children) {
        if (file instanceof File) {
          System.out.print("  ");
          file.printName();
        } else if (file instanceof Folder) {
          printTree(file);
        }
      }
    }
  }

}
