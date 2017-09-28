package dps_01_build_type.dp03_build.example1;

import dps_01_build_type.dp03_build.example1.builder.Builder;
import dps_01_build_type.dp03_build.example1.concrete_builder.ConcreteBuilder1;
import dps_01_build_type.dp03_build.example1.concrete_builder.ConcreteBuilder2;
import dps_01_build_type.dp03_build.example1.director.Director;
import dps_01_build_type.dp03_build.example1.product.Product;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //�����߽�ɫ:
    Director director = new Director();

    //�������߽�ɫ:
    Builder b1 = new ConcreteBuilder1();//���彨���߽�ɫ:
    Builder b2 = new ConcreteBuilder2();//���彨���߽�ɫ:

    director.construct(b1);//�����Ʒ
    //��Ʒ��ɫ
    Product p1 = b1.getResult();//���ش����Ĳ�Ʒ
    p1.show();

    System.out.println();
    director.construct(b2);//�����Ʒ
    //��Ʒ��ɫ
    Product p2 = b2.getResult();//���ش����Ĳ�Ʒ
    p2.show();
  }

}
