package org.cloudhelper.admin.infrastructure.util.event;


import java.util.LinkedList;
import java.util.List;

/**
 * 事件发布器
 *
 * @author kaizi2009
 */
public class EventPublisher<T extends EventSource> {

    private List<EventHandler<T>> eventHandlers = new LinkedList<>();

    private Class<T> eventSourceType;

    public EventPublisher(Class<T> eventSourceType) {
        this.eventSourceType = eventSourceType;
    }

    public void publish(EventObject<T> event) {
        List<EventHandler> eventHandlers = EventContext.getEventHandlers(eventSourceType);
        if (eventHandlers == null) {
            return;
        }
        eventHandlers.forEach(eventHandler -> {
            eventHandler.handle(event);
        });
    }

    public void addEventHandler(EventHandler<T> eventHandler) {
        eventHandlers.add(eventHandler);
    }

}
