package dps_01_build_type.dp04_prototype.deep.example1;

import util.ClassUtil;
import dps_01_build_type.dp04_prototype.deep.example1.concrete_prototype.AppleComputer;
import dps_01_build_type.dp04_prototype.deep.example1.prototype.Computer;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  @SuppressWarnings("deprecation")
  public static void main(String[] args) throws Exception {
    //����ԭ�ͽ�ɫ:�����
    Computer apple = new AppleComputer();
    Computer apple2 = apple.clone();//��¡����
    Computer apple3 = apple.clone();//��¡����
    //����Ϊ��˵������,����һ�����Ƽ�ʹ�õķ�����apple2.produceDate������������,��ΪComputer.clone()
    //ʹ��ʹ�õ������¡,����apple2.produceDate�ĸı䲻��Ӱ�쵽apple.produceDate��apple3.produceDate
    //ע���ӡ����е�����(�������ڲ�����ȫ���)
    apple2.getProduceDate().setYear(1000);

    //��ӡ������ĸ�������ֵ
    ClassUtil.display(apple);
    ClassUtil.display(apple2);
    ClassUtil.display(apple3);
  }

}
