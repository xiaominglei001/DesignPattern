package dps_01_build_type.dp04_prototype.deep.example2;

import dps_01_build_type.dp04_prototype.deep.example2.concrete_prototype.Resume;
import util.ClassUtil;

/**
 * ������<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    //����ԭ�ͽ�ɫ:����
    Resume resume = new Resume("����", "��", 27, new WorkExperience("1998-2003",
        "XX�ɷ����޹�˾"));
    Resume resume2 = resume.clone();//��¡����
    Resume resume3 = resume.clone();//��¡����
    //����Ϊ��˵������,���ö�resume2.workExperience.company������������,��ΪResume.clone()
    //ʹ��ʹ�õ������¡,����resume2.workExperience.company�ĸı䲻��Ӱ�쵽
    //resume.workExperience.company��resume3.workExperience.company
    //ע���ӡ����еĹ�������(�����˵Ĺ�����������ȫһ��)
    resume2.getWorkExperience().setCompany("YY�Ƽ�");

    //��ӡ������ĸ�������ֵ
    ClassUtil.display(resume.getWorkExperience());
    ClassUtil.display(resume2.getWorkExperience());
    ClassUtil.display(resume3.getWorkExperience());
  }

}
