package org.cloudhelper.admin.infrastructure.config;

import org.cloudhelper.admin.domain.event.DddEventSource;
import org.cloudhelper.admin.infrastructure.util.event.EventHandler;
import org.cloudhelper.admin.infrastructure.util.event.anotation.EventSourceType;
import org.cloudhelper.admin.infrastructure.util.event.EventObject;
import org.springframework.stereotype.Component;

/**
 * @author kaizi2009
 */
@Component("dddHandler")
@EventSourceType(DddEventSource.class)
public class XxxHasDddEventHandler implements EventHandler<DddEventSource> {

    @Override
    public void handle(EventObject<DddEventSource> event) {
        System.out.println(event.getSource() + ", " + event.getTimestamp());
    }
}
