package dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_product;

import dps_01_build_type.dp02_factory.abstract_factory.example2.model.User;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.UserDAO;

/**
 * �����Ʒ��ɫ:AccessUserDAO<br>
 * @author Administrator
 */
public class AccessUserDAO implements UserDAO {

  /**
   * ����һ���û���Ϣ<br>
   * @param user
   */
  public void createUser(User user) {
    System.out.println("�� Access �и�User������һ����¼:" + user);
  }

  /**
   * ����һ���û���Ϣ<br>
   * @param id
   * @return User
   */
  public User findUser(String id) {
    System.out.println("�� Access �и���ID�õ���User���һ����¼:" + id);
    return null;
  }

}
