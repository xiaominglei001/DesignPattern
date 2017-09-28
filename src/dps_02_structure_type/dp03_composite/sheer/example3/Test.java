package dps_02_structure_type.dp03_composite.sheer.example3;

import dps_02_structure_type.dp03_composite.sheer.example3.composite.ConcreteCompany;
import dps_02_structure_type.dp03_composite.sheer.example3.leaf.FinanceDept;
import dps_02_structure_type.dp03_composite.sheer.example3.leaf.HRDept;

/**
 * 测试类<br>
 * @author Administrator
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //树干:公司
    ConcreteCompany root = new ConcreteCompany("北京总公司");
    root.add(new HRDept("总公司人力资源部"));//叶子
    root.add(new FinanceDept("总公司财务部"));//叶子

    //树干:公司
    ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
    comp.add(new HRDept("华东分公司人力资源部"));//叶子
    comp.add(new FinanceDept("华东分公司财务部"));//叶子
    root.add(comp);//增加一个孩子

    //树干:公司
    ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
    comp1.add(new HRDept("南京办事处人力资源部"));//叶子
    comp1.add(new FinanceDept("南京办事处财务部"));//叶子
    root.add(comp1);//增加一个孩子

    ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
    comp2.add(new HRDept("杭州办事处人力资源部"));//叶子
    comp2.add(new FinanceDept("杭州办事处财务部"));//叶子
    root.add(comp2);//增加一个孩子

    System.out.println("结构图:");
    root.display(1);//打印出自身

    System.out.println("\n职责:");
    root.lineOfDuty();//履行职责
  }

}
