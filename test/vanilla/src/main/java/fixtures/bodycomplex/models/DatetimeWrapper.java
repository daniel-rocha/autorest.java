/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * The DatetimeWrapper model.
 */
public final class DatetimeWrapper {
    /**
     * The field property.
     */
    @JsonProperty(value = "field")
    private OffsetDateTime field;

    /**
     * The now property.
     */
    @JsonProperty(value = "now")
    private OffsetDateTime now;

    /**
     * Get the field value.
     *
     * @return the field value.
     */
    public OffsetDateTime field() {
        return this.field;
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set.
     * @return the DatetimeWrapper object itself.
     */
    public DatetimeWrapper withField(OffsetDateTime field) {
        this.field = field;
        return this;
    }

    /**
     * Get the now value.
     *
     * @return the now value.
     */
    public OffsetDateTime now() {
        return this.now;
    }

    /**
     * Set the now value.
     *
     * @param now the now value to set.
     * @return the DatetimeWrapper object itself.
     */
    public DatetimeWrapper withNow(OffsetDateTime now) {
        this.now = now;
        return this;
    }
}
