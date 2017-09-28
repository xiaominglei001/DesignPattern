package dps_03_action_type.dp01_chain_of_responsibility.example4;

import dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler.AuthFilter;
import dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler.OtherFilter;
import dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler.URLRewriteFilter;
import dps_03_action_type.dp01_chain_of_responsibility.example4.handler.BaseFilter;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //ʵ�ֳ������߽�ɫ:
    BaseFilter otherfilter = new OtherFilter();//���崦���߽�ɫ:�����������˹����Ĺ�����
    BaseFilter urlfilter = new URLRewriteFilter();//���崦���߽�ɫ:����url�Ĺ�����
    BaseFilter authfilter = new AuthFilter();//���崦���߽�ɫ:���������֤�Ĺ�����

    otherfilter.setNextFilter(urlfilter);// �����¼�
    urlfilter.setNextFilter(authfilter);// �����¼�

    otherfilter.executeFilter();//ִ�й���
  }

}
