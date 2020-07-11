## Programing Tips
1. 不能随便修改业务对象，除非你对业务对象的作用范围已经*非常熟悉*
2. @Data的使用范围
    @EqualsAndHashCode，因为单元测试需要对比两个对象是否相等，所以需要提供equals方法，否则，默认的equals方法实际对比的是两个对象的地址是否相等。@EqualsAndHashCode不仅仅是对比的类需要，该类中聚合的其他类，以及父类也需要。
    ps：如果一个对象会作为mock语句的参数，那么它也需要有@EqualsAndHashCode，因为只有这样才能断定两个对象是相等的，从而返回设定的值。
	
    @ToString，因为如果对象对比失败，需要显示对象有哪些不同。所以，在显示对象差异时，会调用对象的ToString方法将对象序列化成字符串进行输出。
	
    @NoArgsConstructor，如果对象没有显式声明一个构造函数，那么就会有一个默认的空构造函数。但是一旦声明了自己的构造函数，那么空构造函数就也需要显式声明。如果没有空构造函数，就没有办法使用jackson将json转化为对象（因为jackson会利用空构造函数先创建一个实例，再将字段注入实例）

    @Getter, @Setter
    getter和setter会在序列化/反序列化的时候被使用（使用jackson/fastjson）
3. 尽量保持request, entity, dto的字段一致
4. response的data中不应该添加没有必要的层级结构
5. 使用get和set方法比直接使用字段更好。例如，当我们需要对这个字段输出时，需要进行类型转换或者其他处理操作，我们直接更改get方法就行了。没必要对每个调用处进行更改。即修改对调用者来说是隐藏的。
    如果没有操作数据库的api和页面，那就不应该使用数据库，应该使用配置进行替代；否则，很难让数据在所有环境下都适用
6. 使用"XXX".toLowerCase().euquals("XXX")
    使用这个判断的时候一定要加上locale，因为toLowerCase会默认使用当前环境的locale进行转换。如果当前环境的locale不是英语的话，可能会出现转换成一些特殊字符，导致validate失败
    如果仅仅是为了判断是否相等，可以使用equalsIgnoreCase，这个函数会将两个字符串都toUpperCase和toLowerCase来进行判断，这样就不会产生以上问题。