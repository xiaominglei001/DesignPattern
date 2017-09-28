package dps_01_build_type.dp04_prototype.shallow.example1.concrete_prototype;

import java.util.Date;

import dps_01_build_type.dp04_prototype.shallow.example1.prototype.Computer;

/***
 * ����ԭ�ͽ�ɫ:����<br>
 * @author Administrator
 */
public class HPComputer extends Computer {

  private static final long serialVersionUID = 6435376593176702869L;

  /**
   * ���캯��
   */
  public HPComputer() {
    this("���ջ�", 1024, 1024 * 100, new Date());
  }

  /**
   * ���캯��<br>
   * @param name 
   * @param ram 
   * @param harddisk 
   * @param produceDate 
   */
  public HPComputer(String name, long ram, long harddisk, Date produceDate) {
    super(name, ram, harddisk, produceDate);
  }

}
