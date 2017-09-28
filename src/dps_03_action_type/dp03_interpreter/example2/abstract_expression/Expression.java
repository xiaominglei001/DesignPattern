package dps_03_action_type.dp03_interpreter.example2.abstract_expression;

import java.util.HashMap;
import java.util.Map;

import dps_03_action_type.dp03_interpreter.example2.context.Context;

/**
 * AbstractExpression:������ʽ������һ������Ľ��Ͳ���������ӿ�Ϊ�����﷨�������еĽڵ�������<br>
 * @author Administrator
 */
public abstract class Expression {

  /**���������밢�����������ֵĶ�Ӧ�ֵ�*/
  private Map<String, Integer> map = new HashMap<String, Integer>(9);

  /**
   * ���캯��
   */
  public Expression() {
    map.put("Ҽ", 1);
    map.put("��", 2);
    map.put("��", 3);
    map.put("��", 4);
    map.put("��", 5);
    map.put("½", 6);
    map.put("��", 7);
    map.put("��", 8);
    map.put("��", 9);
  }

  /**
   * ���͵�����,���Ա����า��<br>
   * @param context 
   */
  public void interpret(Context context) {
    //���Ҫ������ַ�������Ϊ0�򷵻�
    if (context.getStatement().length() == 0) {
      return;
    }
    
    //��map��key����ѭ��
    for (String key : map.keySet()) {
      //statement��key+��ǰ��λ����,����:"��ǧ������ʰ"����ʰ��β
      if (context.getStatement().endsWith(key + getPostifix())) {
        int value = map.get(key);//ȡ��valueֵ,�����������
        //data+=(value*��λ),����:data+=(3*10),��һ����ѭ�����˿����� data+=(4*100)
        context.setData(context.getData() + value * multiplier());
        //������˴κ�,��Ҫ���ַ������洦������ַ���ȡ��,����:��ǧ������ʰ-->��ǧ����
        context.setStatement(context.getStatement().substring(0,
            context.getStatement().length() - getLength()));
        break;
      }

      //����ĩβΪ������,ֱ�Ӱ���ص�����,����:��ǧ������-->��ǧ����
      if (context.getStatement().endsWith("��")) {
        context.setStatement(context.getStatement().substring(0,
            context.getStatement().length() - 1));
        break;
      }
    }
    
  }

  /**
   * ȡ�������ֵ�λ,��λ��Ϊ"",ʮλ��Ϊ"ʰ",��λ��Ϊ"��",ǧλ��Ϊ"ǧ"<br>
   * ���ఴ��Ҫ��д<br>
   * @return String
   */
  public abstract String getPostifix();

  /**
   * ����<br>
   * ����:��λ������Ϊ2,�����Ϊ2*1<br>
   * ����:��λ������Ϊ3,���ʾ3*10<br>
   * ���ఴ��Ҫ��д<br>
   * @return int
   */
  public abstract int multiplier();

  /**
   * ��ȡ���ı��ʽ��һ����С���ֵ�Ԫռ�ݵ�λ�ó���<br>
   * ����:��λ�ĳ���Ϊһλ<br>
   * ����������ʰ,��ʾ��λ<br>
   * ��������,��ʾ��λ<br>
   * @return int
   */
  public abstract int getLength();

}
