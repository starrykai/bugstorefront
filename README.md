# #hybris练习
目标：
基于hybris实现一个Bug管理的系统，功能有：Bug的增删查改、在Bug详情页中提交comment。

*这是一个hybris的练习，功能部分并没有全部完成，稍后会进行完善。*

## 已实现部分：

* 后台管理
    Bug和BugComment在backoffice中的管理 V0.1
* 前台展示

  1. bug列表展示 V0.1
  2. bug详情查看 V0.1
  3. bug删除 V0.1

## 未实现部分：

	1. bug添加
	2. bug修改
	3. comment提交

## 问题：

1. 未实现部分实现了部分后台的逻辑，主要的问题在表单提交部分。

2. 过程中的疑问：

   *  开发到controller层和前段的交互中，是否每次修改都需要ant all & 重启hybrisserver，对新手来说比较耗时，是否有其他方法；

   *  枚举类型、String类型之间的相互转换；

   *  不太清楚url的映射规则，在html中发起请求怎么组装url；

   *  项目中静态资源的管理。所有的网页是否都要改为jsp，还是根据需要来修改；css文件的引用，jsp文件和html文件中引入css，路径是不相同的，是否可以统一。

   *  基于这个练习，BugModel的父类ItemModel已经有comments域，系统中也已经有了Comment这个item，并且ItemModel与Comment之间有对应的关系。hybris设计这个Comment的作用是什么？

   *  在Comment提交的时候，用户名是用户填写还是获取系统当前用户。

      ​

