package dps_01_build_type.dp02_factory.abstract_factory.example2.product;

import dps_01_build_type.dp02_factory.abstract_factory.example2.model.User;

/**
 * �����Ʒ��ɫ:UserDAO<br>
 * @author Administrator
 */
public interface UserDAO {

  /**
   * ����һ���û���Ϣ<br>
   * @param user
   */
  public void createUser(User user);

  /**
   * ����һ���û���Ϣ<br>
   * @param id
   * @return User
   */
  public User findUser(String id);

}
