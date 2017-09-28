package dps_01_build_type.dp04_prototype.deep.example2;

import dps_01_build_type.dp04_prototype.deep.example2.concrete_prototype.Resume;
import util.ClassUtil;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    //具体原型角色:简历
    Resume resume = new Resume("张三", "男", 27, new WorkExperience("1998-2003",
        "XX股份有限公司"));
    Resume resume2 = resume.clone();//克隆自身
    Resume resume3 = resume.clone();//克隆自身
    //这里为了说明问题,调用对resume2.workExperience.company进行重新设置,因为Resume.clone()
    //使用使用的是深克隆,所以resume2.workExperience.company的改变不会影响到
    //resume.workExperience.company和resume3.workExperience.company
    //注意打印结果中的工作经历(三个人的工作经历不完全一样)
    resume2.getWorkExperience().setCompany("YY科技");

    //打印出对象的各个属性值
    ClassUtil.display(resume.getWorkExperience());
    ClassUtil.display(resume2.getWorkExperience());
    ClassUtil.display(resume3.getWorkExperience());
  }

}
