package dps_03_action_type.dp01_chain_of_responsibility.example4.handler;

/**
 * 实现抽象处理者角色接口,做为基础类,被具体处理者角色（Concrete Handler）继承<br>
 * 可以没有此类<br>
 * @author Administrator
 */
public abstract class BaseFilter implements Filter {

  /**
   * 下一个过滤器
   */
  private Filter nextFilter;

  /**
   * 执行下一步过滤,如果没有下一步过滤,则执行本身的过滤工作
   */
  public void doNextFilter() {
    if (nextFilter == null) {
      // do something you need here!
      System.out.println("there is no filter in the chain!!!!!!!!");
    } else {
      nextFilter.executeFilter();
    }
  }

  /**
   * 该方法用来注入下一个filter
   * @param nextFilter
   */
  public void setNextFilter(Filter nextFilter) {
    this.nextFilter = nextFilter;
  }

}
