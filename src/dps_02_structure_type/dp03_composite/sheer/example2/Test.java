package dps_02_structure_type.dp03_composite.sheer.example2;

import java.util.List;

import dps_02_structure_type.dp03_composite.sheer.example2.component.AbsFile;
import dps_02_structure_type.dp03_composite.sheer.example2.composite.Folder;
import dps_02_structure_type.dp03_composite.sheer.example2.leaf.File;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����һ�����ε��ļ�/Ŀ¼�ṹ
    //����:�ļ���
    Folder root = new Folder("C:\\");
    Folder folder1 = new Folder("folder1");
    Folder folder2 = new Folder("folder2");

    //���Ӻ���
    root.addChild(folder1);
    root.addChild(folder2);

    //Ҷ��:�ļ�
    File file1 = new File("Test.java");
    File file2 = new File("Test2.java");

    //���Ӻ���
    folder2.addChild(file1);
    folder2.addChild(file2);

    //��root������������Ⱥ
    printTree(root);
    System.out.println();

    printTree(new File("OneWord.java"));
    System.out.println();

    printTree(null);
  }

  /**
   * ��ӡ��������Ϣ<br>
   * @param ifile
   */
  private static void printTree(AbsFile ifile) {
    //��Ϊ�մ�ӡ��null
    if (ifile == null) {
      System.out.println("null");
      return;
    } else if (ifile instanceof File) {
      //���ļ���ӡ���ļ���
      ifile.printName();
      return;
    } else {
      //���ļ��д�ӡ���ļ�����
      ifile.printName();
      //��ȡ���ļ����������ļ������,���ݹ��������
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
