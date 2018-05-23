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

/**
 * Defines headers for responseEnum operation.
 */
public class HeaderResponseEnumHeaders {
    /**
     * response with header values "GREY" or null. Possible values include:
     * 'White', 'black', 'GREY'.
     */
    @JsonProperty(value = "value")
    private GreyscaleColors value;

    /**
     * Get response with header values "GREY" or null. Possible values include: 'White', 'black', 'GREY'.
     *
     * @return the value value
     */
    public GreyscaleColors value() {
        return this.value;
    }

    /**
     * Set response with header values "GREY" or null. Possible values include: 'White', 'black', 'GREY'.
     *
     * @param value the value value to set
     * @return the HeaderResponseEnumHeaders object itself.
     */
    public HeaderResponseEnumHeaders withValue(GreyscaleColors value) {
        this.value = value;
        return this;
    }

}
