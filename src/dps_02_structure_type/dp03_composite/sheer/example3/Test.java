package dps_02_structure_type.dp03_composite.sheer.example3;

import dps_02_structure_type.dp03_composite.sheer.example3.composite.ConcreteCompany;
import dps_02_structure_type.dp03_composite.sheer.example3.leaf.FinanceDept;
import dps_02_structure_type.dp03_composite.sheer.example3.leaf.HRDept;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //����:��˾
    ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
    root.add(new HRDept("�ܹ�˾������Դ��"));//Ҷ��
    root.add(new FinanceDept("�ܹ�˾����"));//Ҷ��

    //����:��˾
    ConcreteCompany comp = new ConcreteCompany("�Ϻ������ֹ�˾");
    comp.add(new HRDept("�����ֹ�˾������Դ��"));//Ҷ��
    comp.add(new FinanceDept("�����ֹ�˾����"));//Ҷ��
    root.add(comp);//����һ������

    //����:��˾
    ConcreteCompany comp1 = new ConcreteCompany("�Ͼ����´�");
    comp1.add(new HRDept("�Ͼ����´�������Դ��"));//Ҷ��
    comp1.add(new FinanceDept("�Ͼ����´�����"));//Ҷ��
    root.add(comp1);//����һ������

    ConcreteCompany comp2 = new ConcreteCompany("���ݰ��´�");
    comp2.add(new HRDept("���ݰ��´�������Դ��"));//Ҷ��
    comp2.add(new FinanceDept("���ݰ��´�����"));//Ҷ��
    root.add(comp2);//����һ������

    System.out.println("�ṹͼ:");
    root.display(1);//��ӡ������

    System.out.println("\nְ��:");
    root.lineOfDuty();//����ְ��
  }

}
