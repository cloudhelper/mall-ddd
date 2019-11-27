# 领域驱动设计Helper
## 领域事件
通过领域事件解耦领域之间的交互

1 在领域A中定义事件源
```java
public class DddEventSource implements EventSource {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
```
2 在领域A中发布事件
```java
DddEventSource eventSource = new DddEventSource();
eventSource.setId("1");
EventContext.publishEvent(eventSource);
```
3 在领域B中监听事件
```java
@Component("dddHandler")
@EventSourceType(DddEventSource.class)
public class DddEventHandler implements EventHandler<DddEventSource> {

    @Override
    public void handle(EventObject<DddEventSource> event) {
        System.out.println(event.getSource() + ", " + event.getTimestamp() );
    }
}
```

 

