package dps_01_build_type.dp02_factory.abstract_factory.example1;

import dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_creator.SqlServerFactory;
import dps_01_build_type.dp02_factory.abstract_factory.example1.creator.Factory;
import dps_01_build_type.dp02_factory.abstract_factory.example1.model.Dept;
import dps_01_build_type.dp02_factory.abstract_factory.example1.model.User;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.UserDAO;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    User user = new User();
    Dept dept = new Dept();

    //���Ҫ�������ݿ�,ֻ��Ҫ���������
    //���󹤳���ɫ:����DAO�Ĺ���
    Factory factory = new SqlServerFactory();

    //�����Ʒ��ɫ:UserDAO,DeptDAO
    UserDAO userdao = factory.createUserDAO();
    DeptDAO deptdao = factory.createDeptDAO();

    //����һ���û���Ϣ
    userdao.createUser(user);
    userdao.findUser("u001");

    //����һ��������Ϣ
    deptdao.createDept(dept);
    deptdao.findDept("d001");
  }

}