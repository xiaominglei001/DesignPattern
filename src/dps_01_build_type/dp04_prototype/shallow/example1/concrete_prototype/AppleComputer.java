package dps_01_build_type.dp04_prototype.shallow.example1.concrete_prototype;

import java.util.Date;

import dps_01_build_type.dp04_prototype.shallow.example1.prototype.Computer;

/***
 * ����ԭ�ͽ�ɫ:ƻ����<br>
 * @author Administrator
 */
public class AppleComputer extends Computer {

  private static final long serialVersionUID = 8582456749155370705L;

  /**
   * ���캯��
   */
  public AppleComputer() {
    this("ƻ����", 2048, 2048 * 100, new Date());
  }

  /**
   * ���캯��<br>
   * @param name 
   * @param ram 
   * @param harddisk 
   * @param produceDate 
   */
  public AppleComputer(String name, long ram, long harddisk, Date produceDate) {
    super(name, ram, harddisk, produceDate);
  }

}
