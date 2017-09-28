package dps_01_build_type.dp04_prototype.shallow.example1.concrete_prototype;

import java.util.Date;

import dps_01_build_type.dp04_prototype.shallow.example1.prototype.Computer;

/***
 * 具体原型角色:苹果机<br>
 * @author Administrator
 */
public class AppleComputer extends Computer {

  private static final long serialVersionUID = 8582456749155370705L;

  /**
   * 构造函数
   */
  public AppleComputer() {
    this("苹果机", 2048, 2048 * 100, new Date());
  }

  /**
   * 构造函数<br>
   * @param name 
   * @param ram 
   * @param harddisk 
   * @param produceDate 
   */
  public AppleComputer(String name, long ram, long harddisk, Date produceDate) {
    super(name, ram, harddisk, produceDate);
  }

}
