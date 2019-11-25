# 公共部分

- `domain` 领域的公共部分
  - `model` 领域模型的公共部分
  - `repository` 领域模型所需要的仓储(SPI方式)
    - 采用依赖倒置原: 所有依赖基础实施实现的抽象接口，都应该定义在领域层或应用层中。
  - `service` 领域服务的公共部分
- `infrastructure` 基础设施的公共部分
  - `repository` 仓储实现的公共部分
- `util` 工具类

