package dps_01_build_type.dp02_factory.abstract_factory.example1.product;

import dps_01_build_type.dp02_factory.abstract_factory.example1.model.Dept;

/**
 * 抽象产品角色:DeptDAO<br>
 * @author Administrator
 */
public interface DeptDAO {

  /**
   * 插入一条部门信息<br>
   * @param dept
   */
  public void createDept(Dept dept);

  /**
   * 查找一条部门信息<br>
   * @param id
   * @return Dept
   */
  public Dept findDept(String id);

}
