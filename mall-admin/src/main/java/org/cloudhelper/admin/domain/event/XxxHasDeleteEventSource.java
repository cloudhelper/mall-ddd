package org.cloudhelper.admin.domain.event;


import org.cloudhelper.ddd.helper.domain.event.EventSource;

/**
 * 删除事件源
 *
 * @author kaizi2009
 */
public class XxxHasDeleteEventSource implements EventSource {

    private String id;

    public XxxHasDeleteEventSource(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
