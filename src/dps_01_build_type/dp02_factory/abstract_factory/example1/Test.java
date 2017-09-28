package dps_01_build_type.dp02_factory.abstract_factory.example1;

import dps_01_build_type.dp02_factory.abstract_factory.example1.concrete_creator.SqlServerFactory;
import dps_01_build_type.dp02_factory.abstract_factory.example1.creator.Factory;
import dps_01_build_type.dp02_factory.abstract_factory.example1.model.Dept;
import dps_01_build_type.dp02_factory.abstract_factory.example1.model.User;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.DeptDAO;
import dps_01_build_type.dp02_factory.abstract_factory.example1.product.UserDAO;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    User user = new User();
    Dept dept = new Dept();

    //如果要更换数据库,只需要改下面这句
    //抽象工厂角色:创建DAO的工厂
    Factory factory = new SqlServerFactory();

    //抽象产品角色:UserDAO,DeptDAO
    UserDAO userdao = factory.createUserDAO();
    DeptDAO deptdao = factory.createDeptDAO();

    //插入一条用户信息
    userdao.createUser(user);
    userdao.findUser("u001");

    //插入一条部门信息
    deptdao.createDept(dept);
    deptdao.findDept("d001");
  }

}