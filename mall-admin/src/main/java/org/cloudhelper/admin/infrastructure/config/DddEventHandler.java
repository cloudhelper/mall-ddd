package org.cloudhelper.admin.infrastructure.config;

import org.cloudhelper.admin.domain.event.DddEventSource;
import org.cloudhelper.ddd.helper.domain.event.EventHandler;
import org.cloudhelper.ddd.helper.domain.event.EventObject;
import org.cloudhelper.ddd.helper.domain.event.anotation.EventSourceType;
import org.springframework.stereotype.Component;

/**
 * @author kaizi2009
 */
@Component("dddHandler")
@EventSourceType(DddEventSource.class)
public class DddEventHandler implements EventHandler<DddEventSource> {

    @Override
    public void handle(EventObject<DddEventSource> event) {
        System.out.println(event.getSource() + ", " + event.getTimestamp() );
    }
}
