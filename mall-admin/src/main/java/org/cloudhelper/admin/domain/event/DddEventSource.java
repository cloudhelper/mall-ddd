package org.cloudhelper.admin.domain.event;

import org.cloudhelper.ddd.helper.domain.event.EventSource;

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
