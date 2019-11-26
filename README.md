# 领域驱动设计

设计模式在领域驱动设计中的应用

- 领域模型
  - 外观设计模式
  - 工厂模式
- 领域模型的创建
  - 工厂模式
  - Build模式
- 领域模型的状态处理
  - 卫语法
  - 表格法
  - 职责链模式
  - 状态模式
  
package
- 通过package定义边界
- 领域层
  - 每个领域一个package, 便于阅读和维护
- ui层
  - 首先通过package定义端点的类型, 如web, mq, job等
  - 对服务进行分类, 不一定要按照领域划分
- 基础设施层
  - 可以不划分领域, 可以按照基础设施类型划分
  
- 模块
  - `mall-common` 公共部分
  - `mall-admin` 管理后台
  - `mall` 服务
  
DDD与CQRS https://www.jianshu.com/p/Tozpp3

spring SPI https://blog.csdn.net/kongxincai0/article/details/81435528

在DDD架构中，通常会将查询和命令操作分开



