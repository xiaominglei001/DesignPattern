package dps_03_action_type.dp10_template_method.example2;

import dps_03_action_type.dp10_template_method.example2.abstract_class.TestPaper;
import dps_03_action_type.dp10_template_method.example2.concrete_class.TestPaperA;
import dps_03_action_type.dp10_template_method.example2.concrete_class.TestPaperB;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("ѧ��A����:");
    //����ģ�棨AbstractClass����ɫ
    TestPaper paperA = new TestPaperA();
    paperA.testQuestion1();//����1
    paperA.testQuestion2();//����2
    paperA.testQuestion3();//����3

    System.out.println("\nѧ��B����:");
    //����ģ�棨AbstractClass����ɫ
    TestPaper paperB = new TestPaperB();
    paperB.testQuestion1();//����1
    paperB.testQuestion2();//����2
    paperB.testQuestion3();//����3
  }

}
