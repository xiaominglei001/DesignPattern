package dps_03_action_type.dp08_state.example4;

import dps_03_action_type.dp08_state.example4.context.Work;

/**
 * 测试类<br>
 * 如果要完成'员工必须在20点之前离开公司',只需要增加一个'强制下班状态',
 * 并改动一下傍晚工作状态类的判断就可以了<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //使用环境（Context）角色：工作
    Work project = new Work();
    
    //对时间进行多次设置,然后调用
    project.setHour(9);
    project.writeProgram();
    project.setHour(10);
    project.writeProgram();
    project.setHour(12);
    project.writeProgram();
    project.setHour(13);
    project.writeProgram();
    project.setHour(14);
    project.writeProgram();
    project.setHour(17);

    //project.setFinish(false);
    project.setFinish(true);

    project.writeProgram();
    project.setHour(19);
    project.writeProgram();
    project.setHour(22);
    project.writeProgram();
  }

}
