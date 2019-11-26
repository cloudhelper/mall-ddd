package com.cloudhelper.ddd;

import org.cloudhelper.admin.domain.event.DddEventSource;
import org.cloudhelper.admin.infrastructure.util.event.EventContext;
import org.junit.Test;

/**
 * @author kaizi2009
 */
public class TestEventHandler extends BaseJunit {

    @Test
    public void test() {
        EventContext.publishEvent(new DddEventSource());
    }
}
