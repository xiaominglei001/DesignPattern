package dps_03_action_type.dp06_memento.example1.memento;

/**
 * ����¼��Memento����ɫ������¼��ɫ�洢�����������ɫ�����ڲ�״̬��<br>
 * �����������ɫ��������Ҫ��������¼��ɫ�洢�����������ɫ������Щ�ڲ�״̬��<br>
 * Ϊ�˷�ֹ�����������ɫ�����������������ʱ���¼������¼ʵ�����������ӿڣ�<br>
 * ������¼�����߽�ɫ��ֻ�ܿ�������¼�ṩ��խ�ӿڡ������ڱ���¼��ɫ�д�ŵ������ǲ��ɼ��ġ�<br>
 * �����������ɫ�����ܹ�����һ����ӿڡ����ܹ��õ��Լ����뱸��¼��ɫ�����ԡ� <br>
 * @author Administrator
 */
public class Memento {

  /**
   * �����洢�����˵�״̬,��������������ֵ,�뷢���˱���һ�¼���
   */
  private String state;

  /**
   * ���캯��<br>
   * @param state
   */
  public Memento(String state) {
    this.state = state;
  }

  /**
   * @return the state
   */
  public String getState() {
    return state;
  }

}
