/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for post307 operation.
 */
public class HttpRedirectsPost307Headers {
    /**
     * The redirect location for this request. Possible values include:
     * '/http/success/post/200'.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the redirect location for this request. Possible values include: '/http/success/post/200'.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the redirect location for this request. Possible values include: '/http/success/post/200'.
     *
     * @param location the location value to set
     * @return the HttpRedirectsPost307Headers object itself.
     */
    public HttpRedirectsPost307Headers withLocation(String location) {
        this.location = location;
        return this;
    }

}
