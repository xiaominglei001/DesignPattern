package dps_03_action_type.dp06_memento.example2.memento;

/**
 * ����¼��Memento����ɫ������¼��ɫ�洢�����������ɫ�����ڲ�״̬��<br>
 * �����������ɫ��������Ҫ��������¼��ɫ�洢�����������ɫ������Щ�ڲ�״̬��<br>
 * Ϊ�˷�ֹ�����������ɫ�����������������ʱ���¼������¼ʵ�����������ӿڣ�<br>
 * ������¼�����߽�ɫ��ֻ�ܿ�������¼�ṩ��խ�ӿڡ������ڱ���¼��ɫ�д�ŵ������ǲ��ɼ��ġ�<br>
 * �����������ɫ�����ܹ�����һ����ӿڡ����ܹ��õ��Լ����뱸��¼��ɫ�����ԡ� <br>
 * @author Administrator
 */
public class Memento {

  /**
   * �����洢�����˵�״̬�İ汾ID,��ʷ�汾��Ψһ��ʶ
   */
  private String versionId;

  /**
   * �����洢�����˵�״̬,��������������ֵ,�뷢���˱���һ�¼���<br>
   * ״̬����,����
   */
  private String force;

  /**״̬����,���ݶ�*/
  private String quick;

  /**
   * ���캯��<br>
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
