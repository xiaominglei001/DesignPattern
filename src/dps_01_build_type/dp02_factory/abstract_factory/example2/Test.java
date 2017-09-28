package dps_01_build_type.dp02_factory.abstract_factory.example2;

import dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_creator.DAOFactory;
import dps_01_build_type.dp02_factory.abstract_factory.example2.model.Dept;
import dps_01_build_type.dp02_factory.abstract_factory.example2.model.User;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.UserDAO;

/**
 * ������:�ڴ���Ӧ�ó��󹤳���ɫ����ʡ��<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    User user = new User();//ģ����:�û�
    Dept dept = new Dept();//ģ����:����

    //���Ҫ�������ݿ�,�ͻ��������޸�
    //�����Ʒ��ɫ:UserDAO
    UserDAO userdao = DAOFactory.createUserDAO();
    DeptDAO deptdao = DAOFactory.createDeptDAO();

    //����һ���û���Ϣ
    userdao.createUser(user);
    userdao.findUser("u001");

    //����һ��������Ϣ
    deptdao.createDept(dept);
    deptdao.findDept("d001");
  }

}