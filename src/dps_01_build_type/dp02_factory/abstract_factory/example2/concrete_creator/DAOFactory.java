package dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_creator;

import dps_01_build_type.dp02_factory.abstract_factory.example2.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.UserDAO;

/**
 * 具体工厂角色:创建DAO的工厂<br>
 * @author Administrator
 */
public class DAOFactory {

  /**
   * 这里用反射来创建数据库访问对象的实例,[数据库类型dbtype],
   * 如果需要改数据库,只需要把其改成"Access",这个值可在配置文件中配置
   * dbtype=SqlServer/Access
   */
  private static final String dbtype = "SqlServer";

  /**
   * 创建一个UserDAO<br>
   * @return UserDAO
   * @throws Exception 
   */
  public static UserDAO createUserDAO() throws Exception {
    return (UserDAO) Class.forName(
        "dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_product."
            + dbtype + "UserDAO").newInstance();
  }

  /**
   * 创建一个DeptDAO<br>
   * @return DeptDAO
   * @throws Exception 
   */
  public static DeptDAO createDeptDAO() throws Exception {
    return (DeptDAO) Class
        .forName(
            "dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_product.AccessDeptDAO")
        .newInstance();
  }

}