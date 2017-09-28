package dps_01_build_type.dp02_factory.abstract_factory.example2;

import dps_01_build_type.dp02_factory.abstract_factory.example2.concrete_creator.DAOFactory;
import dps_01_build_type.dp02_factory.abstract_factory.example2.model.Dept;
import dps_01_build_type.dp02_factory.abstract_factory.example2.model.User;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example2.product.UserDAO;

/**
 * 测试类:在此种应用抽象工厂角色可以省略<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    User user = new User();//模型类:用户
    Dept dept = new Dept();//模型类:部门

    //如果要更换数据库,客户端无需修改
    //抽象产品角色:UserDAO
    UserDAO userdao = DAOFactory.createUserDAO();
    DeptDAO deptdao = DAOFactory.createDeptDAO();

    //插入一条用户信息
    userdao.createUser(user);
    userdao.findUser("u001");

    //插入一条部门信息
    deptdao.createDept(dept);
    deptdao.findDept("d001");
  }

}