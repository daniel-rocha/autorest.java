/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.v2.DateTimeRfc1123;
import org.threeten.bp.OffsetDateTime;

/**
 * Defines headers for responseDatetimeRfc1123 operation.
 */
public final class HeaderResponseDatetimeRfc1123Headers {
    /**
     * response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01
     * Jan 0001 00:00:00 GMT".
     */
    @JsonProperty(value = "value")
    private DateTimeRfc1123 value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public OffsetDateTime value() {
        if (this.value == null) {
            return null;
        }
        return this.value.dateTime();
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the HeaderResponseDatetimeRfc1123Headers object itself.
     */
    public HeaderResponseDatetimeRfc1123Headers withValue(OffsetDateTime value) {
        if (value == null) {
            this.value = null;
        } else {
            this.value = new DateTimeRfc1123(value);
        }
        return this;
    }
}
