package dps_03_action_type.dp06_memento.example2.memento;

/**
 * 备忘录（Memento）角色：备忘录角色存储“备忘发起角色”的内部状态。<br>
 * “备忘发起角色”根据需要决定备忘录角色存储“备忘发起角色”的哪些内部状态。<br>
 * 为了防止“备忘发起角色”以外的其他对象访问备忘录。备忘录实际上有两个接口，<br>
 * “备忘录管理者角色”只能看到备忘录提供的窄接口——对于备忘录角色中存放的属性是不可见的。<br>
 * “备忘发起角色”则能够看到一个宽接口——能够得到自己放入备忘录角色中属性。 <br>
 * @author Administrator
 */
public class Memento {

  /**
   * 用来存储发起人的状态的版本ID,历史版本的唯一标识
   */
  private String versionId;

  /**
   * 用来存储发起人的状态,可以是任意属性值,与发起人保持一致即可<br>
   * 状态属性,力量
   */
  private String force;

  /**状态属性,敏捷度*/
  private String quick;

  /**
   * 构造函数<br>
   * @param versionId 
   * @param force
   * @param quick
   */
  public Memento(String versionId, String force, String quick) {
    this.versionId = versionId;
    this.force = force;
    this.quick = quick;
  }

  /**
   * @return the force
   */
  public String getForce() {
    return force;
  }

  /**
   * @param force the force to set
   */
  public void setForce(String force) {
    this.force = force;
  }

  /**
   * @return the quick
   */
  public String getQuick() {
    return quick;
  }

  /**
   * @param quick the quick to set
   */
  public void setQuick(String quick) {
    this.quick = quick;
  }

  /**
   * @return the versionId
   */
  public String getVersionId() {
    return versionId;
  }

  /**
   * @param versionId the versionId to set
   */
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

}
