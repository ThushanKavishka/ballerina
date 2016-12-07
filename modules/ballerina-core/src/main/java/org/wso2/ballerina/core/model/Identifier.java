/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.wso2.ballerina.core.model;

/**
 * {@code Identifier} represents an identifier in Ballerina
 * <p>
 * Here only the name of the identifier is stored.
 *
 * @since 1.0.0
 */
public class Identifier {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    /**
     * Get the name of the Identifier
     *
     * @return name of the Identifier
     */
    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        Identifier other = (Identifier) obj;
        return this.name.equals(other.getName());
    }

    public int hashCode() {
        return name.length();
    }
}