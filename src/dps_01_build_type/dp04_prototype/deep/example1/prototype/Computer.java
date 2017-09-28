package dps_01_build_type.dp04_prototype.deep.example1.prototype;

import java.util.Date;

/**
 * ����ԭ�ͽ�ɫ:�����<br>
 * @author Administrator
 */
public abstract class Computer implements Cloneable {

  /**�������*/
  private String name;
  /**�ڴ�*/
  private long ram;
  /**Ӳ��*/
  private long harddisk;
  /**��������*/
  private Date produceDate;

  /**
   * ���캯��<br>
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
   * �����¡����,���������д(�����������ʵ��)<br>
   * @return Computer
   * @throws CloneNotSupportedException 
   */
  public Computer clone() throws CloneNotSupportedException {
    Computer c = (Computer) super.clone();
    //����String���ǲ�����,long��Ϊ������������,ִ��super.clone()��¡��,
    //name,ram,harddisk������¡,��Date�����ǿɱ����,ֻ�ǿ�¡��һ��
    //produceDate���������,��this.produceDate���ڲ����Է����仯ʱ,
    //����¡�Ķ����produceDateҲ���ű�,��������Ҫ��produceDate����һ�����¡.
    c.setProduceDate((Date) produceDate.clone());
    return c;
  }

}
