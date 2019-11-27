package org.cloudhelper.ddd.helper.domain.event;

/**
 * 事件处理
 *
 * @author kaizi2009
 */
public interface EventHandler<T extends EventSource> {

    /**
     * Handle event
     *
     * @param event
     */
    void handle(EventObject<T> event);
}
