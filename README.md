# ResponsibilityDemo

定义：
 使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止

使用场景：
 多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定。
 在请求处理者不明确的情况下向多个对象中的一个提交一个请求
 需要动态指定一组对象处理请求

UML类图


  这个是一个简化版的




运行结果：


Handler：抽象处理角色，声明一个 请求处理的方法， 并在其中保持一个对下一个处理节点Handler对象的引用。

ConcreteHandler： 具体处理者角色，对请求进行处理，如果不能处理则将该请求转发给下一个节点上的处理对象。

上面是简单的原因就是，对请求的形式来说，是固定的，但是实际上，却往往不是固定的请求。

下面看正常的：

UML类图如下：


这里的请求有了抽象层，可以根据需要来发送想要的请求，让处理者处理对应的请求。







输出

关键就在下面这里


加上else，交给下一个对象处理，输出就会改变了。（这才是真正的责任链模式。。。）


通过判断当前的处理者和请求者的级别是否对应来处理

Android 源码中的责任链模式实现： view分发机制

小结：

 优点：可以对请求者和处理者关系解耦，提高代码的灵活性

 缺点：对链中请求处理者的遍历，如果处理者太多，那么遍历必定会影响性能，特别是在一些递归调用中，要慎重。



 
