接收UI层的请求, CQRS读写分离
  - `assembler` 对返回结果封装
  - `command` 修改类型的服务, 经过领域模型
    - impl 查询实现
    - repository 仓库的SPI接口, 对仓储提出查询需求
  - `query` 查询了类型的服务, 可以使用领域的部分, 如领域中的枚举, 但不经过领域模型
    - impl 查询实现
    - repository 仓库的SPI接口, 对仓储提出查询需求
  
  
  - `service` 接收UI层的请求
    - 可复用的,需要满足不同的ui请求, 如web,feign,dubbo等
      - 同样的服务, web和dubbo的返回结果是有区别的, web在大多数情况下返回结果更丰富, 如一些状态的名称需要解释, 尤其是在查询场景
    - service层返回DTO, 不能返回数据模型或领域模型
    
    