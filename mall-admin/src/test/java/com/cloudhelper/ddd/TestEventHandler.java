package com.cloudhelper.ddd;

import org.cloudhelper.admin.domain.event.DddEventSource;
import org.cloudhelper.ddd.helper.domain.event.EventContext;
import org.junit.Test;

/**
 * @author kaizi2009
 */
public class TestEventHandler extends BaseJunit {

    @Test
    public void test() {
        DddEventSource eventSource = new DddEventSource();
        eventSource.setId("1");
        EventContext.publishEvent(eventSource);
    }
}
