package dps_01_build_type.dp04_prototype.deep.example2.concrete_prototype;

import dps_01_build_type.dp04_prototype.deep.example2.WorkExperience;
import dps_01_build_type.dp04_prototype.deep.example2.prototype.AbstractPrototype;

/***
 * 具体原型角色:简历<br>
 * @author Administrator
 */
public class Resume implements AbstractPrototype {

  private static final long serialVersionUID = -475961195339557149L;
  /**名字*/
  private String name;
  /**性别*/
  private String sex;
  /**年龄*/
  private int age;
  /**工作经历*/
  private WorkExperience workExperience;

  /**
   * 构造函数<br>
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
   * 定义克隆方法,子类可以重写(这里用深拷贝来实现)<br>
   * @return Resume
   * @throws CloneNotSupportedException 
   */
  public Resume clone() throws CloneNotSupportedException {
    //由于String类是不变类,int又为基本数据类型,执行super.clone()克隆后,
    //name,sex,age均被克隆,而WorkExperience类型是可变对象,只是克隆了一个
    //workExperience对象的引用,当this.workExperience的内部属性发生变化时,
    //被克隆的对象的workExperience也跟着变,所以这里要调用workExperience.clone对其进行克隆.
    Resume resume = (Resume) super.clone();
    resume.setWorkExperience(workExperience.clone());
    return resume;
  }

}
