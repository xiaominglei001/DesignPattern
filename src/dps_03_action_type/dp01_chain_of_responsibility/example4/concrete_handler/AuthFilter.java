package dps_03_action_type.dp01_chain_of_responsibility.example4.concrete_handler;

import dps_03_action_type.dp01_chain_of_responsibility.example4.handler.BaseFilter;

/**
 * ���崦���߽�ɫ��Concrete Handler����ʵ�ֳ����ɫ�ж���Ľӿڣ��������������������������ܴ�����������ĺ���ߡ�<br>
 * ���������֤�Ĺ�����<br>
 * @author Administrator
 */
public class AuthFilter extends BaseFilter {

  /**
   * ִ�й���
   */
  public void executeFilter() {
    System.out.println("1.check the user in this filter!");
    doNextFilter();
    System.out.println("2.check the user in this filter!");
  }

}