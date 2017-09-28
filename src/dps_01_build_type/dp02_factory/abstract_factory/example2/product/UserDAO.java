package dps_01_build_type.dp02_factory.abstract_factory.example2.product;

import dps_01_build_type.dp02_factory.abstract_factory.example2.model.User;

/**
 * 抽象产品角色:UserDAO<br>
 * @author Administrator
 */
public interface UserDAO {

  /**
   * 插入一条用户信息<br>
   * @param user
   */
  public void createUser(User user);

  /**
   * 查找一条用户信息<br>
   * @param id
   * @return User
   */
  public User findUser(String id);

}
