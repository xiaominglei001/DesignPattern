package dps_03_action_type.dp05_mediator.example3.mediator;

import dps_03_action_type.dp05_mediator.example3.colleague.Country;

/**
 * �����ͣ��Ҳ���н��ߣ�Mediator����ɫ�������ͬ�¶��󵽵�ͣ�߶���Ľӿڣ�<br>
 * ������Ҫ�ķ�����һ�����������¼���������ĳЩ����£��������������ʡ�ԡ�<br>
 * ���Ϲ�����<br>
 * @author Administrator
 */
public abstract class UnitedNations {

  /**
   * ����<br>
   * @param message 
   * @param colleague
   */
  public abstract void declare(String message, Country colleague);

}
