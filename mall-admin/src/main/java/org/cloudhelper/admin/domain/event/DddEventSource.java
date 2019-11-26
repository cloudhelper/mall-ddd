package org.cloudhelper.admin.domain.event;

import org.cloudhelper.admin.infrastructure.util.event.EventSource;

/**
 * 事件源
 *
 * @author kaizi2009
 */
public class DddEventSource implements EventSource {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
