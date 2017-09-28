package dps_02_structure_type.dp01_adapter.object.example3.adapter;

import dps_02_structure_type.dp01_adapter.object.example3.adaptee.ForeignCenter;
import dps_02_structure_type.dp01_adapter.object.example3.target.Player;

/**
 * ��������Adapter����ɫ:��Դ�ӿ�ת����Ŀ��ӿ�,��һ��ɫ��������.<br>
 * @author Administrator
 */
public class Translator extends Player {

  /**�⼮�з�*/
  private ForeignCenter wjzf;

  /**
   * ���캯��<br>
   * @param name 
   */
  public Translator(String name) {
    super(name);
    wjzf = new ForeignCenter();
    wjzf.setName(name);
  }

  /**
   * ����
   */
  public void attack() {
    wjzf.����();
  }

  /**
   * ����
   */
  public void defense() {
    wjzf.����();
  }

}
