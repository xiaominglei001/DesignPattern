package dps_01_build_type.dp02_factory.abstract_factory.example1.creator;

import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.UserDAO;

/**
 * ���󹤳���ɫ:����DAO�Ĺ���<br>
 * @author Administrator
 */
public interface Factory {

  /**
   * ����һ��UserDAO<br>
   * @return UserDAO
   */
  public UserDAO createUserDAO();

  /**
   * ����һ��DeptDAO<br>
   * @return DeptDAO
   */
  public DeptDAO createDeptDAO();

}
