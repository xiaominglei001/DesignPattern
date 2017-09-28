package dps_03_action_type.dp10_template_method.example2;

import dps_03_action_type.dp10_template_method.example2.abstract_class.TestPaper;
import dps_03_action_type.dp10_template_method.example2.concrete_class.TestPaperA;
import dps_03_action_type.dp10_template_method.example2.concrete_class.TestPaperB;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("学生A答题:");
    //抽象模版（AbstractClass）角色
    TestPaper paperA = new TestPaperA();
    paperA.testQuestion1();//答题1
    paperA.testQuestion2();//答题2
    paperA.testQuestion3();//答题3

    System.out.println("\n学生B答题:");
    //抽象模版（AbstractClass）角色
    TestPaper paperB = new TestPaperB();
    paperB.testQuestion1();//答题1
    paperB.testQuestion2();//答题2
    paperB.testQuestion3();//答题3
  }

}
