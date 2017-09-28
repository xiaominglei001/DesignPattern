package dps_03_action_type.dp10_template_method.example2.abstract_class;

/**
 * 抽象模版（AbstractClass）角色有如下的责任： <br>
 * 定义了一个或多个抽象操作，以便让子类实现。这些抽象操作叫做基本操作，它们是一个顶级逻辑的组成步骤。<br>
 * 定义并实现了一个模版方法。这个模版方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，<br>
 * 而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。<br>
 * 考试题<br>
 * @author Administrator
 */
public abstract class TestPaper {

  /**
   * 第1题
   */
  public void testQuestion1() {
    System.out
        .println("1.杨过得到,后来给了郭靖,炼成倚天剑,屠龙刀的玄铁可能是[]a.球磨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
    System.out.println("答案:" + answer1());
  }

  /**
   * 第2题
   */
  public void testQuestion2() {
    System.out
        .println("2.杨过,程英,陆无双铲除了情花,造成[]a.使这种植物不再害人 b.使一种珍惜植物灭绝 c.破坏了那个生物圈的生态平衡 d.造成该地区沙漠化");
    System.out.println("答案:" + answer2());
  }

  /**
   * 第3题
   */
  public void testQuestion3() {
    System.out
        .println("3.蓝凤凰致使华山师徒,桃谷六仙呕吐不止,如果你是大夫,会给他们开什么药[]a.阿司匹林 b.牛黄解毒片 c.氟哌酸 d.让他们喝大量的生牛奶 e.以上全不对");
    System.out.println("答案:" + answer3());
  }

  /**
   * 第1题答案
   * @return String
   */
  public abstract String answer1();

  /**
   * 第2题答案
   * @return String
   */
  public abstract String answer2();

  /**
   * 第3题答案
   * @return String
   */
  public abstract String answer3();

}
