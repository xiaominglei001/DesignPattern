package dps_03_action_type.dp05_mediator.example3.colleague;

import dps_03_action_type.dp05_mediator.example3.mediator.UnitedNations;

/**
 * ����ͬ���ࣨColleague����ɫ:�������ͣ�ߵ�ͬ�¶���Ľӿڡ�<br>
 * ͬ�¶���ֻ֪����ͣ�߶���֪�������ͬ�¶���<br>
 * ����(����)<br>
 * @author Administrator
 */
public abstract class Country {

  /**�����ͣ��:���Ϲ�����*/
  protected UnitedNations mediator;

  /**
   * ���캯��<br>
   * @param mediator 
   */
  public Country(UnitedNations mediator) {
    this.mediator = mediator;
  }

}
