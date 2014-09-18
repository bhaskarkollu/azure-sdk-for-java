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

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* List of resource providers.
*/
public class ProviderListResult extends OperationResponse {
    private String nextLink;
    
    /**
    * Optional. Gets or sets the URL to get the next set of results.
    * @return The NextLink value.
    */
    public String getNextLink() {
        return this.nextLink;
    }
    
    /**
    * Optional. Gets or sets the URL to get the next set of results.
    * @param nextLinkValue The NextLink value.
    */
    public void setNextLink(final String nextLinkValue) {
        this.nextLink = nextLinkValue;
    }
    
    private ArrayList<Provider> providers;
    
    /**
    * Optional. Gets or sets the list of resource providers.
    * @return The Providers value.
    */
    public ArrayList<Provider> getProviders() {
        return this.providers;
    }
    
    /**
    * Optional. Gets or sets the list of resource providers.
    * @param providersValue The Providers value.
    */
    public void setProviders(final ArrayList<Provider> providersValue) {
        this.providers = providersValue;
    }
    
    /**
    * Initializes a new instance of the ProviderListResult class.
    *
    */
    public ProviderListResult() {
        super();
        this.setProviders(new ArrayList<Provider>());
    }
}
