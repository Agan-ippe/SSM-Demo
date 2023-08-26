# SSM整合demo

这是一个基于SSM框架的CRUD项目，参考B站尚硅谷的SSM整合教程。视频教学中只有一个查询所有员工，展示到员工列表页面的功能。此demo目前只完善了核心的增删查改功能，具体使用中还是有很多待完善的地方，感兴趣的伙伴可以自行完善。

> 尚硅谷2022年SSM整合教程
>
> https://www.bilibili.com/video/BV1Ya411S7aT/?share_source=copy_web&vd_source=f8340c4026115fdc3a178ce1879c37ab

---

> 完善方向：
>
> - 使用正则进行输入检查，避免不合法数据，比如邮箱
> - 在信息不完全的情况下，将提交按钮禁用之类的
> - 关键信息脱敏
> - 完善后可以尝试自己上线，增加自己的项目上线经验

## 开发环境

- idea：2020.1.2
- maven：3.6.3
- tomcat：9.0.71
- mysql：8



## 技术栈

`Spring` `SpringMVC` `MyBaits` `thymeleaf` `Ajax`



## 数据库结构

![数据库结构图](C:\Users\93988\Desktop\studynotes\SSM\ssmdemo\imgs\数据库结构图.png)



## 实现功能

- 增加员工
- 删除员工
- 修改员工
- 查询员工
- 分页查询



## 效果图

> 分页显示员工列表

![分页](C:\Users\93988\Desktop\studynotes\SSM\ssmdemo\imgs\分页.gif)



> 新增功能

![新增](C:\Users\93988\Desktop\studynotes\SSM\ssmdemo\imgs\添加.gif)



>查询功能

![查询](C:\Users\93988\Desktop\studynotes\SSM\ssmdemo\imgs\查询.gif)



> 删除

![删除](C:\Users\93988\Desktop\studynotes\SSM\ssmdemo\imgs\删除.gif)



> 修改

![修改](C:\Users\93988\Desktop\studynotes\SSM\ssmdemo\imgs\修改.gif)



## 本项目仅限于学习交流