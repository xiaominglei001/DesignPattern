package dps_03_action_type.dp03_interpreter.example2.nonterminal_expression;

import dps_03_action_type.dp03_interpreter.example2.abstract_expression.Expression;

/**
 * ���ս����ʽ��ɫ:���͸�λ��<br>
 * @author Administrator
 */
public class NonterminalOneExpression extends Expression {

  /**
   * ȡ�������ֵ�λ,��λ��Ϊ"",ʮλ��Ϊ"ʰ",��λ��Ϊ"��",ǧλ��Ϊ"ǧ"<br>
   * ���ఴ��Ҫ��д<br>
   * @return String
   */
  public String getPostifix() {
    return "";
  }

  /**
   * ����<br>
   * ����:��λ������Ϊ2,�����Ϊ2*1<br>
   * ����:��λ������Ϊ3,���ʾ3*10<br>
   * @return int
   */
  public int multiplier() {
    return 1;
  }

  /**
   * ��ȡ���ı���ʽ��һ����С���ֵ�Ԫռ�ݵ�λ�ó���<br>
   * ����:��λ�ĳ���Ϊһλ<br>
   * ����������ʰ,��ʾ��λ<br>
   * ��������,��ʾ��λ<br>
   * @return int
   */
  public int getLength() {
    return 1;
  }

}