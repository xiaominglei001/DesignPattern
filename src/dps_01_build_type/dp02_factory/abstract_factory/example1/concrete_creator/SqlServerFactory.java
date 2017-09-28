package dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_creator;

import dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_product.SqlServerDeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_product.SqlServerUserDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.creator.Factory;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.UserDAO;

/**
 * ���幤����ɫ:����DAO�Ĺ���<br>
 * @author Administrator
 */
public class SqlServerFactory implements Factory {

  /**
   * ����һ��SqlServerUserDAO<br>
   * @return UserDAO
   */
  public UserDAO createUserDAO() {
    return new SqlServerUserDAO();
  }

  /**
   * ����һ��SqlServerDeptDAO<br>
   * @return DeptDAO
   */
  public DeptDAO createDeptDAO() {
    return new SqlServerDeptDAO();
  }

}