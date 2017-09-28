package dps_03_action_type.dp07_observer.example2.concrete_subject;

import java.util.Observable;

//Observable��Observer��˵���� 
//�̳���Observable�������ʾ���۲�Ķ���ʵ���˽ӿ�Observer�����ʾ�۲���.
//������������м̳���Observable������NewsDispatcher(�����ɷ���)��ʾ���۲�Ķ���
//�����µ����ŵ�ʱ�������������ɷ������еĶ�����(Reader),Reader��ʵ����Observer�ӿڵ����ʾ���ߡ� 

//Observable�ļ򵥹��ܽ��ܣ� 
//addObserver(Observer o)  ��ӹ۲��� 
//clearChanged() ����仯����ѡ��仯��־����Ϊfalse 
//countObservers() ͳ�ƹ۲������� 
//deleteObserver(Observer o) ɾ���۲��� 
//deleteObservers() ɾ�����еĹ۲��� 
//hasChanged() �����Ƿ��б仯(�򷵻ء��仯��־��) 
//notifyObservers() ���hasChanged()=ture��֪ͨ���еĹ۲���(�����Observer.update()����) 
//notifyObservers(Object arg) ���hasChanged()=ture��֪ͨ���еĹ۲���(�����Observer.update()����),���Ѳ���arg����ȥ 
//setChanged() ���ñ仯����ѡ��仯��־����Ϊtrue 

/**
 * �������⣨��ɹ۲��ߣ���ɫ:�����ɷ����������µ�����ʱ�ɷ������еĶ��Ķ���<br>
 * @author Administrator
 */
public class NewsDispatcher extends Observable {

  /**  
   * ������ŵ�ʱ�򣬰��������ݷ������еĶ�����  
   * @param news  
   */
  public void addNews(String news) {
    this.setChanged();
    this.notifyObservers(news);
  }

}
