package dps_01_build_type.dp02_factory.abstract_factory.example1.product;

import dps_01_build_type.dp02_factory.abstract_factory.example1.model.Dept;

/**
 * �����Ʒ��ɫ:DeptDAO<br>
 * @author Administrator
 */
public interface DeptDAO {

  /**
   * ����һ��������Ϣ<br>
   * @param dept
   */
  public void createDept(Dept dept);

  /**
   * ����һ��������Ϣ<br>
   * @param id
   * @return Dept
   */
  public Dept findDept(String id);

}
