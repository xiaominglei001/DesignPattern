package dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_product;

import dps_01_build_type.dp02_factory.abstract_factory.example1.model.Dept;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;

/**
 * �����Ʒ��ɫ:AccessDeptDAO<br>
 * @author Administrator
 */
public class AccessDeptDAO implements DeptDAO {

  /**
   * ����һ��������Ϣ<br>
   * @param dept
   */
  public void createDept(Dept dept) {
    System.out.println("�� Access �и�Dept������һ����¼:" + dept);
  }

  /**
   * ����һ��������Ϣ<br>
   * @param id
   * @return Dept
   */
  public Dept findDept(String id) {
    System.out.println("�� Access �и���ID�õ���Dept���һ����¼:" + id);
    return null;
  }

}
