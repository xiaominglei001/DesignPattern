package dps_02_structure_type.dp04_decorator.example2;

import dps_02_structure_type.dp04_decorator.example2.component.IPerson;
import dps_02_structure_type.dp04_decorator.example2.concrete_component.Person;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.BigTrouser;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.LeatherShoes;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.Sneakers;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.Suit;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.TShirts;
import dps_02_structure_type.dp04_decorator.example2.concrete_decorator.Tie;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //���󹹼���Component����ɫ����
    IPerson xc = new Person("С��");

    System.out.println("��һ��װ��:");
    //����װ�Σ�Concrete Decorator����ɫ��
    Sneakers pqx = new Sneakers();//����Ь
    BigTrouser kk = new BigTrouser();//���
    TShirts dtx = new TShirts();//����

    //װ��
    pqx.decorate(xc);
    kk.decorate(pqx);
    dtx.decorate(kk);
    //չʾ�Լ�
    dtx.show();

    System.out.println("\n�ڶ���װ��:");
    //����װ�Σ�Concrete Decorator����ɫ��
    LeatherShoes px = new LeatherShoes();//ƤЬ
    Tie ld = new Tie();//���
    Suit xz = new Suit();//��װ

    //װ��
    px.decorate(xc);
    ld.decorate(px);
    xz.decorate(ld);
    //չʾ�Լ�
    xz.show();
  }

}
