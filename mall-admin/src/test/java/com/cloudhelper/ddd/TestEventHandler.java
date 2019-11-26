package com.cloudhelper.ddd;

import javax.annotation.Resource;
import org.cloudhelper.admin.infrastructure.util.event.EventObject;
import org.cloudhelper.admin.infrastructure.util.event.EventPublisher;
import org.junit.Test;

/**
 * @author kaizi2009
 */
public class TestEventHandler extends BaseJunit {

    @Resource
    private EventPublisher<Boolean> eventPublisher;

    @Test
    public void test() {
        eventPublisher.publish(new EventObject<>(true));
    }
}
