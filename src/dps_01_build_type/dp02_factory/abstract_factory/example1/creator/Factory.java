package dps_01_build_type.dp02_factory.abstract_factory.example1.creator;

import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.UserDAO;

/**
 * 抽象工厂角色:创建DAO的工厂<br>
 * @author Administrator
 */
public interface Factory {

  /**
   * 创建一个UserDAO<br>
   * @return UserDAO
   */
  public UserDAO createUserDAO();

  /**
   * 创建一个DeptDAO<br>
   * @return DeptDAO
   */
  public DeptDAO createDeptDAO();

}
