package dps_01_build_type.dp04_prototype.deep.example2.concrete_prototype;

import dps_01_build_type.dp04_prototype.deep.example2.WorkExperience;
import dps_01_build_type.dp04_prototype.deep.example2.prototype.AbstractPrototype;

/***
 * ����ԭ�ͽ�ɫ:����<br>
 * @author Administrator
 */
public class Resume implements AbstractPrototype {

  private static final long serialVersionUID = -475961195339557149L;
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
   * �����¡����,���������д(�����������ʵ��)<br>
   * @return Resume
   * @throws CloneNotSupportedException 
   */
  public Resume clone() throws CloneNotSupportedException {
    //����String���ǲ�����,int��Ϊ������������,ִ��super.clone()��¡��,
    //name,sex,age������¡,��WorkExperience�����ǿɱ����,ֻ�ǿ�¡��һ��
    //workExperience���������,��this.workExperience���ڲ����Է����仯ʱ,
    //����¡�Ķ����workExperienceҲ���ű�,��������Ҫ����workExperience.clone������п�¡.
    Resume resume = (Resume) super.clone();
    resume.setWorkExperience(workExperience.clone());
    return resume;
  }

}
