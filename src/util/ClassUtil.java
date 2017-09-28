package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * 打印出对象或集合中各个对象的各个属性值,调试时非常有用,<br>
 * 不要随意更改,可以运行此方法的main函数查看运行效果,此类的细节可以不用关注<br>
 * 调用方式:ClassUtil.display(object);<br>
 * @author Administrator
 */
public class ClassUtil {
  private static void displayByObject(Object obj) {
    String className_ = obj.getClass().getName();
    System.out.println("class : " + className_ + "@"
        + Integer.toHexString(obj.hashCode()));
    if (obj instanceof String) {
      System.out.println(obj);
    } else {
      Method[] methods_ = obj.getClass().getMethods();
      Map<String, Object> map_ = new HashMap<String, Object>();
      for (int i = 0; i < methods_.length; i++) {
        String methodName_ = methods_[i].getName();
        if (methodName_.length() <= 3) {
          continue;
        }
        String fieldNameTemp_ = methodName_.substring(3);
        String fieldName_ = fieldNameTemp_.substring(0, 1).toLowerCase()
            + fieldNameTemp_.substring(1, fieldNameTemp_.length());
        if (methodName_.startsWith("get") && !methodName_.equals("getClass")) {
          if (methods_[i].getParameterTypes().length == 0) {
            Object[] args = null;
            Object returnValue_ = "";
            try {
              returnValue_ = methods_[i].invoke(obj, args);
            } catch (IllegalArgumentException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
            map_.put(fieldName_, returnValue_);
          }
        }
      }
      Iterator keys_ = map_.keySet().iterator();
      while (keys_.hasNext()) {
        Object key_ = keys_.next();
        Object value_ = map_.get(key_);
        System.out.println(key_ + " = " + value_);
      }
    }
    System.out.println();
  }

  private static void displayByIterator(Iterator iterator) {
    String className_ = iterator.getClass().getName();
    System.out.println("class : " + className_
        + "   -------start-----------------" + "\n");
    while (iterator.hasNext()) {
      displayByObject(iterator.next());
    }
    System.out.println("class : " + className_
        + "   -------end------------------" + "\n");
  }

  private static void displayByCollection(Collection coll) {
    String className_ = coll.getClass().getName();
    System.out.println("class : " + className_
        + "   -------start-----------------" + "\n");
    Iterator iterator = coll.iterator();
    while (iterator.hasNext()) {
      displayByObject(iterator.next());
    }
    System.out.println("class : " + className_
        + "   -------end------------------" + "\n");
  }

  private static void displayByList(List list) {
    displayByCollection(list);
  }

  private static void displayBySet(Set set) {
    displayByCollection(set);
  }

  private static void displayByMap(Map map) {
    System.out.println("[*** keys start ***]");
    displayBySet(map.keySet());
    System.out.println("[*** keys end ***]");

    System.out.println();

    System.out.println("[*** values start ***]");
    displayByCollection(map.values());
    System.out.println("[*** values start ***]");
  }

  /**
   * @param obj
   */
  public static void display(Object obj) {
    if (obj == null) {
      System.out.println("null");
      return;
    }
    if (obj instanceof List) {
      displayByList((List) obj);
      return;
    }
    if (obj instanceof Set) {
      displayBySet((Set) obj);
      return;
    }
    if (obj instanceof Iterator) {
      displayByIterator((Iterator) obj);
      return;
    }
    if (obj instanceof Map) {
      displayByMap((Map) obj);
      return;
    }
    displayByObject(obj);
  }

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    Object obj = new Object() {
      private String name;

      private String pwd;

      private Date date;
      {
        name = "tome";
        pwd = "123";
        date = new Date();
      }

      @SuppressWarnings("unused")
      public Date getDate() {
        return date;
      }

      @SuppressWarnings("unused")
      public void setDate(Date date) {
        this.date = date;
      }

      @SuppressWarnings("unused")
      public String getName() {
        return name;
      }

      @SuppressWarnings("unused")
      public void setName(String name) {
        this.name = name;
      }

      @SuppressWarnings("unused")
      public String getPwd() {
        return pwd;
      }

      @SuppressWarnings("unused")
      public void setPwd(String pwd) {
        this.pwd = pwd;
      }
    };

    display(obj);
  }

}
