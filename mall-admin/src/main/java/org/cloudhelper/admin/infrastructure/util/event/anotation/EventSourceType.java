package org.cloudhelper.admin.infrastructure.util.event.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kaizi2009
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventSourceType {

    /**
     * Event source type
     *
     * @return
     */
    Class value();
}
