package dps_03_action_type.dp07_observer.example1.concrete_subject;

import dps_03_action_type.dp07_observer.example1.subject.Subject;

/**
 * �������⣨��ɹ۲��ߣ���ɫ<br>
 * @author Administrator
 */
public class ConcreteSubject extends Subject {

  /**����ɹ۲��ߵ�״̬*/
  private String subjectState;

  /**
   * @return the subjectState
   */
  public String getSubjectState() {
    return subjectState;
  }

  /**
   * @param subjectState the subjectState to set
   */
  public void setSubjectState(String subjectState) {
    this.subjectState = subjectState;
  }

}
