/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.resources.models;

import java.util.HashMap;

/**
* Resource information.
*/
public class BasicResource {
    private String location;
    
    /**
    * Required. Gets or sets the location of the resource.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Required. Gets or sets the location of the resource.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String properties;
    
    /**
    * Optional. Gets or sets the resource properties.
    * @return The Properties value.
    */
    public String getProperties() {
        return this.properties;
    }
    
    /**
    * Optional. Gets or sets the resource properties.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final String propertiesValue) {
        this.properties = propertiesValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets resource provisioning state.
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets resource provisioning state.
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private HashMap<String, String> tags;
    
    /**
    * Optional. Gets or sets the tags attached to the resource.
    * @return The Tags value.
    */
    public HashMap<String, String> getTags() {
        return this.tags;
    }
    
    /**
    * Optional. Gets or sets the tags attached to the resource.
    * @param tagsValue The Tags value.
    */
    public void setTags(final HashMap<String, String> tagsValue) {
        this.tags = tagsValue;
    }
    
    /**
    * Initializes a new instance of the BasicResource class.
    *
    */
    public BasicResource() {
        this.setTags(new HashMap<String, String>());
    }
    
    /**
    * Initializes a new instance of the BasicResource class with required
    * arguments.
    *
    */
    public BasicResource(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
