接收UI层的请求
  - `assembler` 对返回结果封装
  - `service` 接收UI层的请求
    - 可复用的,需要满足不同的ui请求, 如web,feign,dubbo等
      - 同样的服务, web和dubbo的返回结果是有区别的, web在大多数情况下返回结果更丰富, 如一些状态的名称需要解释, 尤其是在查询场景
    - service层返回DTO, 不能返回数据模型或领域模型