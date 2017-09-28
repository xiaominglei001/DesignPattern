package dps_03_action_type.dp05_mediator.example2.mediator;

import dps_03_action_type.dp05_mediator.example2.colleague.Colleague;

/**
 * �����ͣ��Ҳ���н��ߣ�Mediator����ɫ�������ͬ�¶��󵽵�ͣ�߶���Ľӿڣ�<br>
 * ������Ҫ�ķ�����һ�����������¼���������ĳЩ����£��������������ʡ�ԡ�<br>
 * @author Administrator
 */
public abstract class Mediator {

  /**
   * �Ѹ���ͬ�½�����֯,Э��<br>
   * @param message 
   * @param colleague
   */
  public abstract void send(String message, Colleague colleague);

}
