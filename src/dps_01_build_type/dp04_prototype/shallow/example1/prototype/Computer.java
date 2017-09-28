package dps_01_build_type.dp04_prototype.shallow.example1.prototype;

import java.util.Date;

/**
 * 抽象原型角色:计算机<br>
 * @author Administrator
 */
public abstract class Computer implements Cloneable {

  /**计算机名*/
  private String name;
  /**内存*/
  private long ram;
  /**硬盘*/
  private long harddisk;
  /**生产日期*/
  private Date produceDate;

  /**
   * 构造函数<br>
   * @param name 
   * @param ram 
   * @param harddisk 
   * @param produceDate 
   */
  public Computer(String name, long ram, long harddisk, Date produceDate) {
    this.name = name;
    this.ram = ram;
    this.harddisk = harddisk;
    this.produceDate = produceDate;
  }

  /**
   * @return the harddisk
   */
  public long getHarddisk() {
    return harddisk;
  }

  /**
   * @param harddisk the harddisk to set
   */
  public void setHarddisk(long harddisk) {
    this.harddisk = harddisk;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the ram
   */
  public long getRam() {
    return ram;
  }

  /**
   * @param ram the ram to set
   */
  public void setRam(long ram) {
    this.ram = ram;
  }

  /**
   * @return the produceDate
   */
  public Date getProduceDate() {
    return produceDate;
  }

  /**
   * @param produceDate the produceDate to set
   */
  public void setProduceDate(Date produceDate) {
    this.produceDate = produceDate;
  }

  /**
   * 定义克隆方法,子类可以重写(这里用浅拷贝来实现)<br>
   * @return Computer
   * @throws CloneNotSupportedException 
   */
  public Computer clone() throws CloneNotSupportedException {
    return (Computer) super.clone();
  }

}
