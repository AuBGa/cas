package org.apereo.cas.web.pac4j;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import org.apereo.cas.util.serialization.AbstractJacksonBackedStringSerializer;

import java.util.Map;

/**
 * This is {@link SessionStoreCookieSerializer}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
public class SessionStoreCookieSerializer extends AbstractJacksonBackedStringSerializer<Map> {
    private static final long serialVersionUID = -1152522695984638020L;

    public SessionStoreCookieSerializer() {
        super(new MinimalPrettyPrinter());
    }

    @Override
    protected Class<Map> getTypeToSerialize() {
        return Map.class;
    }
}
