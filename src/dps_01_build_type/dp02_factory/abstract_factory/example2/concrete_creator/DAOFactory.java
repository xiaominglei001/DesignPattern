package dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_creator;

import dps_01_build_type.dp02_factory.abstract_factory.example2.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.UserDAO;

/**
 * ���幤����ɫ:����DAO�Ĺ���<br>
 * @author Administrator
 */
public class DAOFactory {

  /**
   * �����÷������������ݿ���ʶ����ʵ��,[���ݿ�����dbtype],
   * �����Ҫ�����ݿ�,ֻ��Ҫ����ĳ�"Access",���ֵ���������ļ�������
   * dbtype=SqlServer/Access
   */
  private static final String dbtype = "SqlServer";

  /**
   * ����һ��UserDAO<br>
   * @return UserDAO
   * @throws Exception 
   */
  public static UserDAO createUserDAO() throws Exception {
    return (UserDAO) Class.forName(
        "dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_product."
            + dbtype + "UserDAO").newInstance();
  }

  /**
   * ����һ��DeptDAO<br>
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