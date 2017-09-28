package dps_01_build_type.dp04_prototype.shallow.example2.concrete_prototype;

import dps_01_build_type.dp04_prototype.shallow.example2.WorkExperience;
import dps_01_build_type.dp04_prototype.shallow.example2.prototype.AbstractPrototype;

/***
 * ����ԭ�ͽ�ɫ:����<br>
 * @author Administrator
 */
public class Resume implements AbstractPrototype {

  /**����*/
  private String name;
  /**�Ա�*/
  private String sex;
  /**����*/
  private int age;
  /**��������*/
  private WorkExperience workExperience;

  /**
   * ���캯��<br>
   * @param name
   * @param sex
   * @param age
   * @param workExperience
   */
  public Resume(String name, String sex, int age, WorkExperience workExperience) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.workExperience = workExperience;
  }

  /**
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * @param age the age to set
   */
  public void setAge(int age) {
    this.age = age;
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
   * @return the sex
   */
  public String getSex() {
    return sex;
  }

  /**
   * @param sex the sex to set
   */
  public void setSex(String sex) {
    this.sex = sex;
  }

  /**
   * @return the workExperience
   */
  public WorkExperience getWorkExperience() {
    return workExperience;
  }

  /**
   * @param workExperience the workExperience to set
   */
  public void setWorkExperience(WorkExperience workExperience) {
    this.workExperience = workExperience;
  }

  /**
   * �����¡����,���������д(������ǳ������ʵ��)<br>
   * @return Resume
   * @throws CloneNotSupportedException 
   */
  public Resume clone() throws CloneNotSupportedException {
    return (Resume) super.clone();
  }

}
