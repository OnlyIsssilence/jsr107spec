/**
 *  Copyright (c) 2011 Terracotta, Inc.
 *  Copyright (c) 2011 Oracle and/or its affiliates.
 *
 *  All rights reserved. Use is subject to license terms.
 */
package javax.cache.experimental.events;

/**
 * @author Yannis Cosmadopoulos
 * @since 1.0
 */
public interface EventInterceptor {
    /**
     *
     * @param event
     */
    void onEvent(Event event);
}
