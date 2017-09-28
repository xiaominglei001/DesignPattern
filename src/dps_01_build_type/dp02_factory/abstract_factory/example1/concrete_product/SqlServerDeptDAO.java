package dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_product;

import dps_01_build_type.dp02_factory.abstract_factory.example1.model.Dept;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;

/**
 * 具体产品角色:SqlServerDeptDAO<br>
 * @author Administrator
 */
public class SqlServerDeptDAO implements DeptDAO {

  /**
   * 插入一条部门信息<br>
   * @param dept
   */
  public void createDept(Dept dept) {
    System.out.println("在 SQL Server 中给Dept表增加一条记录:" + dept);
  }

  /**
   * 查找一条部门信息<br>
   * @param id
   * @return Dept
   */
  public Dept findDept(String id) {
    System.out.println("在 SQL Server 中根据ID得到给Dept表的一条记录:" + id);
    return null;
  }

}
