package dps_01_build_type.dp03_build.example1.director;

import dps_01_build_type.dp03_build.example1.builder.Builder;

/**
 * �����߽�ɫ:<br>
 * ���þ��彨���߽�ɫ�Դ�����Ʒ����ָ���߲�û�в�Ʒ��ľ���֪ʶ��<br>
 * ����ӵ�в�Ʒ��ľ���֪ʶ���Ǿ��彨���߶���<br>
 * @author Administrator
 */
public class Director {

  /**
   * �����Ʒȫ����<br>
   * @param builder
   */
  public void construct(Builder builder) {
    builder.buildPartA();
    builder.buildPartB();
  }

}
