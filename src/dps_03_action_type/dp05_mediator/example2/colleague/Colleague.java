package dps_03_action_type.dp05_mediator.example2.colleague;

import dps_03_action_type.dp05_mediator.example2.mediator.Mediator;

/**
 * ����ͬ���ࣨColleague����ɫ:�������ͣ�ߵ�ͬ�¶���Ľӿڡ�<br>
 * ͬ�¶���ֻ֪����ͣ�߶���֪�������ͬ�¶���<br>
 * @author Administrator
 */
public abstract class Colleague {

  /**�����ͣ��*/
  protected Mediator mediator;

  /**
   * ���캯��<br>
   * @param mediator 
   */
  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

}
