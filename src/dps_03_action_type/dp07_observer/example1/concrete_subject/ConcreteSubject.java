package dps_03_action_type.dp07_observer.example1.concrete_subject;

import dps_03_action_type.dp07_observer.example1.subject.Subject;

/**
 * 具体主题（或可观察者）角色<br>
 * @author Administrator
 */
public class ConcreteSubject extends Subject {

  /**具体可观察者的状态*/
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
