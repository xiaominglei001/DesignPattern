package dps_03_action_type.dp10_template_method.example1.abstract_class;

/**
 * ����ģ�棨AbstractClass����ɫ�����µ����Σ� <br>
 * ������һ����������������Ա�������ʵ�֡���Щ���������������������������һ�������߼�����ɲ��衣<br>
 * ���岢ʵ����һ��ģ�淽�������ģ�淽��һ����һ�����巽������������һ�������߼��ĹǼܣ�<br>
 * ���߼�����ɲ�������Ӧ�ĳ�������У��Ƴٵ�����ʵ�֡������߼�Ҳ�п��ܵ���һЩ���巽����<br>
 * @author Administrator
 */
public abstract class AbstractClass {

  /**
   * ������Ϊ1
   */
  public abstract void primitiveOperation1();

  /**
   * ������Ϊ1
   */
  public abstract void primitiveOperation2();

  /**
   * ģ�巽��,�����߼��Ŀ��
   */
  public void templateMethod() {
    primitiveOperation1();
    primitiveOperation2();
    System.out.println("��������.");
  }

}
