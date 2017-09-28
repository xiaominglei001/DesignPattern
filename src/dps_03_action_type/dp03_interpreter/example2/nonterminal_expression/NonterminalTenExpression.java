package dps_03_action_type.dp03_interpreter.example2.nonterminal_expression;

import dps_03_action_type.dp03_interpreter.example2.abstract_expression.Expression;

/**
 * ���ս���ʽ��ɫ:����ʮλ��<br>
 * @author Administrator
 */
public class NonterminalTenExpression extends Expression {

  /**
   * ȡ�������ֵ�λ,��λ��Ϊ"",ʮλ��Ϊ"ʰ",��λ��Ϊ"��",ǧλ��Ϊ"ǧ"<br>
   * ���ఴ��Ҫ��д<br>
   * @return String
   */
  public String getPostifix() {
    return "ʰ";
  }

  /**
   * ����<br>
   * ����:��λ������Ϊ2,�����Ϊ2*1<br>
   * ����:��λ������Ϊ3,���ʾ3*10<br>
   * @return int
   */
  public int multiplier() {
    return 10;
  }

  /**
   * ��ȡ���ı��ʽ��һ����С���ֵ�Ԫռ�ݵ�λ�ó���<br>
   * ����:��λ�ĳ���Ϊһλ<br>
   * ����������ʰ,��ʾ��λ<br>
   * ��������,��ʾ��λ<br>
   * @return int
   */
  public int getLength() {
    return 2;
  }

}
