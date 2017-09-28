package dps_02_structure_type.dp06_flyweight.example1.flyweight;

/**
 * 抽象享元(Flyweight)角色:此角色是所有的具体享元类的基类,为这些类规定出需要实现的公共接口<br>
 * @author Administrator
 */
public interface Flyweight {

  /**
   * 公共接口,要求子类实现<br>
   * @param extrinsicstate 外部状态
   */
  public void operation(int extrinsicstate);

}