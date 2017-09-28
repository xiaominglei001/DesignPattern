package dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_product;

import dps_01_build_type.dp02_factory.abstract_factory.example2.model.User;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.UserDAO;

/**
 * 具体产品角色:AccessUserDAO<br>
 * @author Administrator
 */
public class AccessUserDAO implements UserDAO {

  /**
   * 插入一条用户信息<br>
   * @param user
   */
  public void createUser(User user) {
    System.out.println("在 Access 中给User表增加一条记录:" + user);
  }

  /**
   * 查找一条用户信息<br>
   * @param id
   * @return User
   */
  public User findUser(String id) {
    System.out.println("在 Access 中根据ID得到给User表的一条记录:" + id);
    return null;
  }

}
