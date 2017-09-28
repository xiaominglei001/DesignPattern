package dps_01_build_type.dp02_factory.simple_factory.example2.concrete_creator;

import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationAdd;
import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationDiv;
import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationMul;
import dps_01_build_type.dp02_factory.simple_factory.example2.concrete_product.OperationSub;
import dps_01_build_type.dp02_factory.simple_factory.example2.product.Operation;

/**
 * ���幤�����ɫ�����Ǳ�ģʽ�ĺ��ģ�����һ������ҵ�߼����ж��߼���<br>
 * �򵥹���ģʽ��û�г��󹤳���ɫ<br>
 * @author Administrator
 */
public class OperationFactory {

  /**
   * @param operator
   * @return Operation
   * @throws Exception
   */
  public static Operation createOperation(String operator) throws Exception {
    char c = operator.charAt(0);
    Operation oper = null;
    switch (c) {
    case '+':
      oper = new OperationAdd();//�ӷ�
      break;
    case '-':
      oper = new OperationSub();//����
      break;
    case '*':
      oper = new OperationMul();//�˷�
      break;
    case '/':
      oper = new OperationDiv();//����
      break;
    default:
      throw new Exception("��֧�ֵ��������.");
    }
    return oper;
  }

}
