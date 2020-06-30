## 策略模式

### 什么是策略模式？
> Strategy Design Pattern is a type of behavioral design pattern that encapsulates a "family" of algorithms and selects one from the pool for use during runtime. The algorithms are interchangeable, meaning that they are substitutable for each other.

策略模式是一种行为设计模式，通过封装一系列“算法”，客户端能够在运行时动态的从“算法池”中选择使用哪个具体”算法“。

策略模式由几个主要角色组成：
1. 抽象策略类，一个接口，定义了具体的策略能够向客户端提供的功能
2. 具体策略类，抽象策略类的实现，定义了具体的策略类实现逻辑
3. 环境类，聚合了一个或者多个策略，根据输入选择不同的策略进行处理，并返回最终结果

实际上，策略模式的应用比较灵活，具体的名称以及类结构还可能有变化，可以参见 [策略模式案例](#案例)

### 策略模式的使用场景？
策略模式是为了解决过多、过复杂的条件语句（if-else）而产生的，当业务场景中对于同一行为具有N个不同的处理逻辑的时候，我们就能使用策略模式来避免冗长的条件分支

策略模式的优点：
1. 符合代码的开闭原则，对实际的操作逻辑进行了封装。当需要新的处理逻辑的时候，只需要进行扩展，而不需要修改已有的代码
2. 避免了冗长的条件判断，具有更高的代码可读性 & 代码清洁度
3. if-else的条件判断语句是将具体的实现逻辑的决定权交给了客户端；而策略模式是由各个具体策略向客户端提供自己的使用场景，对于客户端来说不需要考虑在什么情况下选择什么策略，实现了客户端和具体策略类的分离

### 案例
这个案例参考文档[1]编写，具体需要实现的功能是：
### 策略模式思考
策略模式的缺点是什么？真的能够帮助我们减少代码冗余吗？

### 参考文献
1. 别再用if-else了，用注解去代替他吧 [1]
2. 策略模式（策略设计模式）详解 [2]
3. Strategy pattern - wikipedia [3]
4. Keep it Simple with the Strategy Design Pattern [4]

[1]: https://mp.weixin.qq.com/s?__biz=MzI3NzE0NjcwMg==&mid=2650132597&idx=1&sn=7275307700792ec3b2486e3fd9c44097&chksm=f36bcd54c41c44429bc4f37618f17a67f8f892b6ad99149a00c6474f04a03b4097d4a2fbec7c&&xtrack=1&scene=90&subscene=93&sessionid=1592712191&clicktime=1592712203&enterid=1592712203#rd "别再用if-else了，用注解去代替他吧"
[2]: http://c.biancheng.net/view/1378.html "策略模式（策略设计模式）详解"
[3]: https://en.wikipedia.org/wiki/Strategy_pattern "strategy pattern (wikipedia)"
[4]: https://blog.bitsrc.io/keep-it-simple-with-the-strategy-design-pattern-c36a14c985e9 "Keep it Simple with the Strategy Design Pattern"