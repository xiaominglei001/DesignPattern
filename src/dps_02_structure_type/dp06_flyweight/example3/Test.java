package dps_02_structure_type.dp06_flyweight.example3;

import dps_02_structure_type.dp06_flyweight.example3.flyweight.Website;
import dps_02_structure_type.dp06_flyweight.example3.flyweight_factory.WebsiteFactory;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //��Ԫ����(FlyweightFactory)��ɫ:��������վ�Ĵ�����
    WebsiteFactory f = new WebsiteFactory();

    //������Ԫ(Flyweight)��ɫ:��������վ
    Website fx = f.getWebsiteCategory("��Ʒչʾ");
    Website fy = f.getWebsiteCategory("��Ʒչʾ");
    Website fz = f.getWebsiteCategory("��Ʒչʾ");
    Website fl = f.getWebsiteCategory("����");
    Website fm = f.getWebsiteCategory("����");
    Website fn = f.getWebsiteCategory("����");

    //ʹ��
    fx.use(new User("С��"));
    fy.use(new User("����"));
    fz.use(new User("����"));
    fl.use(new User("����ͯ"));
    fm.use(new User("�ҹ�����"));
    fn.use(new User("�Ϻ�����"));

    //��վ������
    System.out.println("�õ���վ��������Ϊ " + f.websiteCount());
  }

}
