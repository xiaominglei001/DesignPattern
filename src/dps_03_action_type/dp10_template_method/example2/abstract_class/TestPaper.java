package dps_03_action_type.dp10_template_method.example2.abstract_class;

/**
 * ����ģ�棨AbstractClass����ɫ�����µ����Σ� <br>
 * ������һ����������������Ա�������ʵ�֡���Щ���������������������������һ�������߼�����ɲ��衣<br>
 * ���岢ʵ����һ��ģ�淽�������ģ�淽��һ����һ�����巽������������һ�������߼��ĹǼܣ�<br>
 * ���߼�����ɲ�������Ӧ�ĳ�������У��Ƴٵ�����ʵ�֡������߼�Ҳ�п��ܵ���һЩ���巽����<br>
 * ������<br>
 * @author Administrator
 */
public abstract class TestPaper {

  /**
   * ��1��
   */
  public void testQuestion1() {
    System.out
        .println("1.����õ�,�������˹���,�������콣,������������������[]a.��ĥ���� b.����� c.���ٺϽ�� d.̼����ά");
    System.out.println("��:" + answer1());
  }

  /**
   * ��2��
   */
  public void testQuestion2() {
    System.out
        .println("2.���,��Ӣ,½��˫�������黨,���[]a.ʹ����ֲ�ﲻ�ٺ��� b.ʹһ����ϧֲ����� c.�ƻ����Ǹ�����Ȧ����̬ƽ�� d.��ɸõ���ɳĮ��");
    System.out.println("��:" + answer2());
  }

  /**
   * ��3��
   */
  public void testQuestion3() {
    System.out
        .println("3.�������ʹ��ɽʦͽ,�ҹ�����Ż�²�ֹ,������Ǵ��,������ǿ�ʲôҩ[]a.��˾ƥ�� b.ţ�ƽⶾƬ c.������ d.�����Ǻȴ�������ţ�� e.����ȫ����");
    System.out.println("��:" + answer3());
  }

  /**
   * ��1���
   * @return String
   */
  public abstract String answer1();

  /**
   * ��2���
   * @return String
   */
  public abstract String answer2();

  /**
   * ��3���
   * @return String
   */
  public abstract String answer3();

}
