/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.implementation.ConfigurationStoresInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ConfigurationStores.
 */
public interface ConfigurationStores extends SupportsCreating<ConfigurationStore.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ConfigurationStore>, SupportsListingByResourceGroup<ConfigurationStore>, SupportsListing<ConfigurationStore>, HasInner<ConfigurationStoresInner> {
    /**
     * Lists the access key for the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApiKey> listKeysAsync(final String resourceGroupName, final String configStoreName);

    /**
     * Regenerates an access key for the specified configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApiKey> regenerateKeyAsync(String resourceGroupName, String configStoreName);

    /**
     * Lists a configuration store key-value.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param listKeyValueParameters The parameters for retrieving a key-value.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<KeyValue> listKeyValueAsync(String resourceGroupName, String configStoreName, ListKeyValueParameters listKeyValueParameters);

}
