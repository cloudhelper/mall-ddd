package org.cloudhelper.admin.infrastructure.config;

import org.cloudhelper.admin.domain.event.XxxHasDeleteEventSource;
import org.cloudhelper.ddd.helper.domain.event.EventHandler;
import org.cloudhelper.ddd.helper.domain.event.EventObject;
import org.cloudhelper.ddd.helper.domain.event.anotation.EventSourceType;
import org.springframework.stereotype.Component;

/**
 * @author kaizi2009
 */
@Component("xxxHasSendEventHandler")
@EventSourceType(XxxHasDeleteEventSource.class)
public class XxxHasSendEventHandler implements EventHandler<XxxHasDeleteEventSource> {

    @Override
    public void handle(EventObject<XxxHasDeleteEventSource> event) {
        System.out.println(event.getSource() + ", " + event.getTimestamp());
    }
}
