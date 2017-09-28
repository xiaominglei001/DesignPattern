package dps_01_build_type.dp04_prototype.deep.example2.prototype;

/**
 * 抽象原型角色:声明一个用于克隆自身的接口,由于object类自带clone方法,而object又是所有类的父类,<br>
 * 所以这里定义不定义clone接口都没关系<br>
 * @author Administrator
 */
public interface AbstractPrototype extends Cloneable {

}
