/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent;

import com.azure.autorest.extension.base.jsonrpc.Connection;
import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.extension.base.plugin.JavaSettingsAccessor;

import java.lang.reflect.Type;

public class TestUtils {

    public static class MockFluentGen extends FluentGen {

        public MockFluentGen() {
            super(new Connection(System.out, System.in), "dummy", "dummy");
            instance = this;

            JavaSettingsAccessor.setHost(this);
        }

        @Override
        public <T> T getValue(Type type, String key) {
            if ("namespace".equals(key)) {
                return (T) "com.azure.resourcemanager.mock";
            } else if ("fluent".equals(key)) {
                return (T) "lite";
            }

            return null;
        }
    }
}
