package org.cloudhelper.admin.infrastructure.util.event;

import java.io.Serializable;

/**
 * 事件对象
 *
 * @author kaizi2009
 */
public class EventObject<T extends EventSource> implements Serializable {

    private final long timestamp = System.currentTimeMillis();
    private T source;

    public EventObject(T source) {
        if (source == null) {
            throw new IllegalArgumentException("null source");
        }
        this.source = source;
    }

    public static <T extends EventSource> EventObject<T> New(T source) {
        return new EventObject(source);
    }

    public T getSource() {
        return source;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[source=" + source + "]";
    }
}
