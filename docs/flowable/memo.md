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