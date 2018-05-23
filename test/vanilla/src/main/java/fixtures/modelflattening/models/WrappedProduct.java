/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The wrapped produc.
 */
public class WrappedProduct {
    /**
     * the product value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the product value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the product value.
     *
     * @param value the value value to set
     * @return the WrappedProduct object itself.
     */
    public WrappedProduct withValue(String value) {
        this.value = value;
        return this;
    }

}
