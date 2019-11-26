package org.cloudhelper.admin.infrastructure.util.event;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.cloudhelper.admin.infrastructure.util.event.anotation.EventSourceType;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author kaizi2009
 */
@Component
public class EventContext implements ApplicationContextAware {

    private static ApplicationContext context;

    private static Map<Class, List<EventHandler>> eventHandlerMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
        Map<String, Object> beansWithAnnotation = context
                .getBeansWithAnnotation(EventSourceType.class);
        Collection<Object> values = beansWithAnnotation.values();
        values.forEach(item -> {
            EventSourceType annotation = item.getClass()
                    .getAnnotation(EventSourceType.class);
            Class eventSourceType = annotation.value();
            List<EventHandler> eventHandlers = eventHandlerMap.get(eventSourceType);
            if (eventHandlers == null) {
                eventHandlers = new LinkedList<>();
                eventHandlerMap.put(eventSourceType, eventHandlers);
            }
            eventHandlers.add((EventHandler) item);
        });
        System.out.println(eventHandlerMap);
    }

    public static List<EventHandler> getEventHandlers(Class eventSourceType) {
        return eventHandlerMap.get(eventSourceType);
    }

}
