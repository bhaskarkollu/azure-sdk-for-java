/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes an Azure Data Lake Store output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.DataLake/Accounts")
@JsonFlatten
public class AzureDataLakeStoreOutputDataSource extends OutputDataSource {
    /**
     * A refresh token that can be used to obtain a valid access token that can
     * then be used to authenticate with the data source. A valid refresh token
     * is currently only obtainable via the Azure Portal. It is recommended to
     * put a dummy string value here when creating the data source and then
     * going to the Azure Portal to authenticate the data source which will
     * update this property with a valid refresh token. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.refreshToken")
    private String refreshToken;

    /**
     * The user principal name (UPN) of the user that was used to obtain the
     * refresh token. Use this property to help remember which user was used to
     * obtain the refresh token.
     */
    @JsonProperty(value = "properties.tokenUserPrincipalName")
    private String tokenUserPrincipalName;

    /**
     * The user display name of the user that was used to obtain the refresh
     * token. Use this property to help remember which user was used to obtain
     * the refresh token.
     */
    @JsonProperty(value = "properties.tokenUserDisplayName")
    private String tokenUserDisplayName;

    /**
     * The name of the Azure Data Lake Store account. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.accountName")
    private String accountName;

    /**
     * The tenant id of the user used to obtain the refresh token. Required on
     * PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * The location of the file to which the output should be written to.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.filePathPrefix")
    private String filePathPrefix;

    /**
     * The date format. Wherever {date} appears in filePathPrefix, the value of
     * this property is used as the date format instead.
     */
    @JsonProperty(value = "properties.dateFormat")
    private String dateFormat;

    /**
     * The time format. Wherever {time} appears in filePathPrefix, the value of
     * this property is used as the time format instead.
     */
    @JsonProperty(value = "properties.timeFormat")
    private String timeFormat;

    /**
     * Get a refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     *
     * @return the refreshToken value
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set a refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     *
     * @param refreshToken the refreshToken value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @return the tokenUserPrincipalName value
     */
    public String tokenUserPrincipalName() {
        return this.tokenUserPrincipalName;
    }

    /**
     * Set the user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @param tokenUserPrincipalName the tokenUserPrincipalName value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withTokenUserPrincipalName(String tokenUserPrincipalName) {
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        return this;
    }

    /**
     * Get the user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @return the tokenUserDisplayName value
     */
    public String tokenUserDisplayName() {
        return this.tokenUserDisplayName;
    }

    /**
     * Set the user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @param tokenUserDisplayName the tokenUserDisplayName value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withTokenUserDisplayName(String tokenUserDisplayName) {
        this.tokenUserDisplayName = tokenUserDisplayName;
        return this;
    }

    /**
     * Get the name of the Azure Data Lake Store account. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the name of the Azure Data Lake Store account. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountName the accountName value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the tenant id of the user used to obtain the refresh token. Required on PUT (CreateOrReplace) requests.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant id of the user used to obtain the refresh token. Required on PUT (CreateOrReplace) requests.
     *
     * @param tenantId the tenantId value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the location of the file to which the output should be written to. Required on PUT (CreateOrReplace) requests.
     *
     * @return the filePathPrefix value
     */
    public String filePathPrefix() {
        return this.filePathPrefix;
    }

    /**
     * Set the location of the file to which the output should be written to. Required on PUT (CreateOrReplace) requests.
     *
     * @param filePathPrefix the filePathPrefix value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withFilePathPrefix(String filePathPrefix) {
        this.filePathPrefix = filePathPrefix;
        return this;
    }

    /**
     * Get the date format. Wherever {date} appears in filePathPrefix, the value of this property is used as the date format instead.
     *
     * @return the dateFormat value
     */
    public String dateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the date format. Wherever {date} appears in filePathPrefix, the value of this property is used as the date format instead.
     *
     * @param dateFormat the dateFormat value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the time format. Wherever {time} appears in filePathPrefix, the value of this property is used as the time format instead.
     *
     * @return the timeFormat value
     */
    public String timeFormat() {
        return this.timeFormat;
    }

    /**
     * Set the time format. Wherever {time} appears in filePathPrefix, the value of this property is used as the time format instead.
     *
     * @param timeFormat the timeFormat value to set
     * @return the AzureDataLakeStoreOutputDataSource object itself.
     */
    public AzureDataLakeStoreOutputDataSource withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

}