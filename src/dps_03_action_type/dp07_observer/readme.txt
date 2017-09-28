Observer(观察者)模式：
观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
这个主题对象在状态上发生变化时，会通知所有观察者对象，使他们能够自动更新自己。

角色： 
1:抽象主题（Subject）角色：主题角色把所有对观察考对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者。
抽象主题提供一个接口，可以增加和删除观察者对象，主题角色又叫做抽象被观察者（Observable）角色，一般用一个抽象类或者一个接口实现。 

2:具体主题（ConcreteSubject）角色：将有关状态存入具体现察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
具体主题角色又叫做具体被观察者角色（Concrete Observable）。具体主题角色通常用一个具体子类实现。 
这里的状态值在本示例中并没有体现出来，被观察者给观察者发出的行为已经转移到抽象主题类的字段中。

3:抽象观察者（Observer）角色：为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。这个接口叫做更新接口。
抽象观察者角色一般用一个抽象类或者一个接口实现。在这个示意性的实现中，更新接口只包含一个方法（即Update()方法），这个方法叫做更新方法。

4:具体观察者（ConcreteObserver）角色：存储与主题的状态自恰的状态。具体现察者角色实现抽象观察者角色所要求的更新接口，
以便使本身的状态与主题的状态相协调。如果需要，具体现察者角色可以保存一个指向具体主题对象的引用。
具体观察者角色通常用一个具体子类实现。

特别的类java.util.Observable和接口 
java.util.Observer,细看发现原来是java类库实现观察着(Observer)模式的类和接口。 

观察者模式定义： 
观察者（Observer）模式又名发布-订阅（Publish/Subscribe）模式。GOF给观察者模式如下定义：定义对象Observer间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。 

Observable和Observer的说明： 
继承于Observable的子类表示被观察的对象，实现了接口Observer的类表示观察者.在下面的例子中继承于Observable的子类NewsDispatcher(新闻派发器)表示被观察的对象，在有新的新闻的时候会把新闻内容派发给所有的订阅者(Reader),Reader是实现了Observer接口的类表示读者。 

Observable的简单功能介绍： 
addObserver(Observer o)  添加观察着 
clearChanged() 清除变化，则把“变化标志”设为false 
countObservers() 统计观察着数量 
deleteObserver(Observer o) 删除观察者 
deleteObservers() 删除所有的观察者 
hasChanged() 测试是否有变化(则返回“变化标志”) 
notifyObservers() 如果hasChanged()=ture，通知所有的观察着(则调用Observer.update()方法) 
notifyObservers(Object arg) 如果hasChanged()=ture，通知所有的观察着(则调用Observer.update()方法),并把参数arg传过去 
setChanged() 设置变化，则把“变化标志”设为true 

Observable的简单功能介绍 
update(Observable o, Object arg) Observable唯一的方法，在被通知时被Observable调用 