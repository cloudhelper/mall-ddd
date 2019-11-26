package org.cloudhelper.admin.domain.event;

import javax.annotation.Resource;
import org.cloudhelper.admin.infrastructure.util.event.EventHandler;
import org.cloudhelper.admin.infrastructure.util.event.EventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 事件发布器配置
 *
 * @author kaizi2009
 */
@Configuration
public class EventPublisherRegisterConfig {

    @Resource(name = "xxxHasSendEventHandler")
    private EventHandler xxxHasSendEventHandler;

    @Resource(name = "dddHandler")
    private EventHandler dddHandler;

    @Bean(name = "xxxHasDeleteEventPublisher")
    public EventPublisher<XxxHasDeleteEventSource> newXxxEventPublisher() {
        EventPublisher publisher = new EventPublisher<>(XxxHasDeleteEventSource.class);
        publisher.addEventHandler(xxxHasSendEventHandler);
        return publisher;
    }

    @Bean(name = "dddPublisher")
    public EventPublisher<DddEventSource> newDddPublisher() {
        EventPublisher<DddEventSource> publisher = new EventPublisher<>(DddEventSource.class);
        publisher.addEventHandler(dddHandler);
        return publisher;
    }
}
