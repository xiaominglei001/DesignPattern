package dps_03_action_type.dp03_interpreter.example2.terminal_expression;

import java.util.regex.Pattern;

import dps_03_action_type.dp03_interpreter.example2.abstract_expression.Expression;
import dps_03_action_type.dp03_interpreter.example2.context.Context;

/**
 * TerminalExpression:�ս�����ʽ��ʵ�����ķ��е��ս��������Ľ��Ͳ�����һ�������е�ÿ���ս����Ҫ�����һ��ʵ����<br>
 * @author Administrator
 */
public class TerminalExpression extends Expression {

  /**
   * ���͵�����<br>
   * @param context 
   */
  public void interpret(Context context) {
    //statementΪnullʱ,���dataΪ0,Ȼ�󷵻�
    if (context.getStatement() == null) {
      context.setData(0);
      context.setStatement("null");//��һ������������,��Ϊ��Ϊ�պ�ֵ������ת����int����
      //������������ʽ���ж�statement��ֵ�ǲ��Ǵ���������,�����������˵���ܹ�ֱ��ת��,Ҳ����˵�ò������ս���ʽ��ɫ
    } else if (Pattern.matches("^-?\\d+$", context.getStatement())) {
      context.setData(Integer.parseInt(context.getStatement()));
      context.setStatement("");//��һ������������,��Ϊ��Ϊ�պ�ֵ������ת����int����
    } else {
      //˵��������Ǻ�������,�����κδ���
    }
  }

  /**
   * ȡ�������ֵ�λ,��λ��Ϊ"",ʮλ��Ϊ"ʰ",��λ��Ϊ"��",ǧλ��Ϊ"ǧ"<br>
   * ���ఴ��Ҫ��д<br>
   * �������սᴦ��,���Է��ض��ٶ�����<br>
   * @return String
   */
  public String getPostifix() {
    return "";
  }

  /**
   * ����<br>
   * �������սᴦ��,���Է��ض��ٶ�����<br>
   * @return int
   */
  public int multiplier() {
    return 0;
  }

  /**
   * ��ȡ���ı��ʽ��һ����С���ֵ�Ԫռ�ݵ�λ�ó���<br>
   * ����:��λ�ĳ���Ϊһλ<br>
   * ����������ʰ,��ʾ��λ<br>
   * ��������,��ʾ��λ<br>
   * �������սᴦ��,���Է��ض��ٶ�����<br>
   * @return int
   */
  public int getLength() {
    return 0;
  }

}
