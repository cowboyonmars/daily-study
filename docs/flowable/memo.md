## flowable备忘录

1. jsonModel中的dockers字段的作用是什么？

2. enos bpm中form组件字段的映射

现阶段前端form组件与flowable的字段没有兼容，导致form组件需要converter进行转换

前端form的字段和flowable的字段有如下mapping关系：
* id — params.frontend_id
* name — id (变量名)
* title - name
* itemType — type (经过转化)
* visibleExpression — params.visibleExpression
* visible — params.visible

FormTypeEnum

**!!FormAwareConverter!!**

可能exception会有一些改变
如果variable和传进来的value有冲突怎么办呢？

jsonNode边遍历边修改是一种非常差的选择

event registry在什么情况下会stop consumer？什么情况下又会start consumer？
start consumer:
1. 启动的时候 handleChannelDefinition
2. 部署的时候 cachingAndArtifactsManager.registerChannelModel
stop consumer：
1. 部署的时候 cachingAndArtifactsManager.unregister
2. 定时任务 DefaultSpringEventRegistryChangeDetectionExecutor
```
protected long eventRegistryChangeDetectionInitialDelayInMs = 10000L;
protected long eventRegistryChangeDetectionDelayInMs = 60000L;
```
定时任务默认60秒运行一次
3. consumer自行中止？

以某个字段A分组，找出分组中字段B最大的数据
```sql
select * from database_name alias where alias.B = (select max(B) from database_name where A = alias.A);
```