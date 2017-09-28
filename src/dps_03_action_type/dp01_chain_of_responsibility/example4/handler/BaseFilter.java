package dps_03_action_type.dp01_chain_of_responsibility.example4.handler;

/**
 * ʵ�ֳ������߽�ɫ�ӿ�,��Ϊ������,�����崦���߽�ɫ��Concrete Handler���̳�<br>
 * ����û�д���<br>
 * @author Administrator
 */
public abstract class BaseFilter implements Filter {

  /**
   * ��һ��������
   */
  private Filter nextFilter;

  /**
   * ִ����һ������,���û����һ������,��ִ�б���Ĺ��˹���
   */
  public void doNextFilter() {
    if (nextFilter == null) {
      // do something you need here!
      System.out.println("there is no filter in the chain!!!!!!!!");
    } else {
      nextFilter.executeFilter();
    }
  }

  /**
   * �÷�������ע����һ��filter
   * @param nextFilter
   */
  public void setNextFilter(Filter nextFilter) {
    this.nextFilter = nextFilter;
  }

}
