package dps_03_action_type.dp08_state.example4;

import dps_03_action_type.dp08_state.example4.context.Work;

/**
 * ������<br>
 * ���Ҫ���'Ա��������20��֮ǰ�뿪��˾',ֻ��Ҫ����һ��'ǿ���°�״̬',
 * ���Ķ�һ�°�����״̬����жϾͿ�����<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //ʹ�û�����Context����ɫ������
    Work project = new Work();
    
    //��ʱ����ж������,Ȼ�����
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
