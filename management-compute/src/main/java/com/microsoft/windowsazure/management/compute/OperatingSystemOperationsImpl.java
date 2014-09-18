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

package com.microsoft.windowsazure.management.compute;

import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.BOMInputStream;
import com.microsoft.windowsazure.core.utils.Base64;
import com.microsoft.windowsazure.core.utils.XmlUtility;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.compute.models.OperatingSystemListFamiliesResponse;
import com.microsoft.windowsazure.management.compute.models.OperatingSystemListResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
* Operations for determining the version of the Azure Guest Operating System on
* which your service is running.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/ff684169.aspx for more
* information)
*/
public class OperatingSystemOperationsImpl implements ServiceOperations<ComputeManagementClientImpl>, OperatingSystemOperations {
    /**
    * Initializes a new instance of the OperatingSystemOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    OperatingSystemOperationsImpl(ComputeManagementClientImpl client) {
        this.client = client;
    }
    
    private ComputeManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.windowsazure.management.compute.ComputeManagementClientImpl.
    * @return The Client value.
    */
    public ComputeManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * The List Operating Systems operation lists the versions of the guest
    * operating system that are currently available in Windows Azure. The
    * 2010-10-28 version of List Operating Systems also indicates what family
    * an operating system version belongs to. Currently Azure supports two
    * operating system families: the Azure guest operating system that is
    * substantially compatible with Windows Server 2008 SP2, and the Azure
    * guest operating system that is substantially compatible with Windows
    * Server 2008 R2.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ff684168.aspx for
    * more information)
    *
    * @return The List Operating Systems operation response.
    */
    @Override
    public Future<OperatingSystemListResponse> listAsync() {
        return this.getClient().getExecutorService().submit(new Callable<OperatingSystemListResponse>() { 
            @Override
            public OperatingSystemListResponse call() throws Exception {
                return list();
            }
         });
    }
    
    /**
    * The List Operating Systems operation lists the versions of the guest
    * operating system that are currently available in Windows Azure. The
    * 2010-10-28 version of List Operating Systems also indicates what family
    * an operating system version belongs to. Currently Azure supports two
    * operating system families: the Azure guest operating system that is
    * substantially compatible with Windows Server 2008 SP2, and the Azure
    * guest operating system that is substantially compatible with Windows
    * Server 2008 R2.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/ff684168.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Operating Systems operation response.
    */
    @Override
    public OperatingSystemListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "listAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/operatingsystems";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2014-06-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperatingSystemListResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new OperatingSystemListResponse();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
            
            Element operatingSystemsSequenceElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "OperatingSystems");
            if (operatingSystemsSequenceElement != null) {
                for (int i1 = 0; i1 < com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(operatingSystemsSequenceElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystem").size(); i1 = i1 + 1) {
                    org.w3c.dom.Element operatingSystemsElement = ((org.w3c.dom.Element) com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(operatingSystemsSequenceElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystem").get(i1));
                    OperatingSystemListResponse.OperatingSystem operatingSystemInstance = new OperatingSystemListResponse.OperatingSystem();
                    result.getOperatingSystems().add(operatingSystemInstance);
                    
                    Element versionElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "Version");
                    if (versionElement != null) {
                        String versionInstance;
                        versionInstance = versionElement.getTextContent();
                        operatingSystemInstance.setVersion(versionInstance);
                    }
                    
                    Element labelElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "Label");
                    if (labelElement != null) {
                        String labelInstance;
                        labelInstance = labelElement.getTextContent() != null ? new String(Base64.decode(labelElement.getTextContent())) : null;
                        operatingSystemInstance.setLabel(labelInstance);
                    }
                    
                    Element isDefaultElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "IsDefault");
                    if (isDefaultElement != null) {
                        boolean isDefaultInstance;
                        isDefaultInstance = DatatypeConverter.parseBoolean(isDefaultElement.getTextContent().toLowerCase());
                        operatingSystemInstance.setIsDefault(isDefaultInstance);
                    }
                    
                    Element isActiveElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "IsActive");
                    if (isActiveElement != null) {
                        boolean isActiveInstance;
                        isActiveInstance = DatatypeConverter.parseBoolean(isActiveElement.getTextContent().toLowerCase());
                        operatingSystemInstance.setIsActive(isActiveInstance);
                    }
                    
                    Element familyElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "Family");
                    if (familyElement != null) {
                        int familyInstance;
                        familyInstance = DatatypeConverter.parseInt(familyElement.getTextContent());
                        operatingSystemInstance.setFamily(familyInstance);
                    }
                    
                    Element familyLabelElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "FamilyLabel");
                    if (familyLabelElement != null) {
                        String familyLabelInstance;
                        familyLabelInstance = familyLabelElement.getTextContent() != null ? new String(Base64.decode(familyLabelElement.getTextContent())) : null;
                        operatingSystemInstance.setFamilyLabel(familyLabelInstance);
                    }
                }
            }
            
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * The List OS Families operation lists the guest operating system families
    * available in Azure, and also lists the operating system versions
    * available for each family. Currently Azure supports two operating system
    * families: the Azure guest operating system that is substantially
    * compatible with Windows Server 2008 SP2, and the Azure guest operating
    * system that is substantially compatible with Windows Server 2008 R2.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/gg441291.aspx
    * for more information)
    *
    * @return The List Operating System Families operation response.
    */
    @Override
    public Future<OperatingSystemListFamiliesResponse> listFamiliesAsync() {
        return this.getClient().getExecutorService().submit(new Callable<OperatingSystemListFamiliesResponse>() { 
            @Override
            public OperatingSystemListFamiliesResponse call() throws Exception {
                return listFamilies();
            }
         });
    }
    
    /**
    * The List OS Families operation lists the guest operating system families
    * available in Azure, and also lists the operating system versions
    * available for each family. Currently Azure supports two operating system
    * families: the Azure guest operating system that is substantially
    * compatible with Windows Server 2008 SP2, and the Azure guest operating
    * system that is substantially compatible with Windows Server 2008 R2.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/gg441291.aspx
    * for more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Operating System Families operation response.
    */
    @Override
    public OperatingSystemListFamiliesResponse listFamilies() throws IOException, ServiceException, ParserConfigurationException, SAXException {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "listFamiliesAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/operatingsystemfamilies";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2014-06-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperatingSystemListFamiliesResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new OperatingSystemListFamiliesResponse();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
            
            Element operatingSystemFamiliesSequenceElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "OperatingSystemFamilies");
            if (operatingSystemFamiliesSequenceElement != null) {
                for (int i1 = 0; i1 < com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(operatingSystemFamiliesSequenceElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystemFamily").size(); i1 = i1 + 1) {
                    org.w3c.dom.Element operatingSystemFamiliesElement = ((org.w3c.dom.Element) com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(operatingSystemFamiliesSequenceElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystemFamily").get(i1));
                    OperatingSystemListFamiliesResponse.OperatingSystemFamily operatingSystemFamilyInstance = new OperatingSystemListFamiliesResponse.OperatingSystemFamily();
                    result.getOperatingSystemFamilies().add(operatingSystemFamilyInstance);
                    
                    Element nameElement = XmlUtility.getElementByTagNameNS(operatingSystemFamiliesElement, "http://schemas.microsoft.com/windowsazure", "Name");
                    if (nameElement != null) {
                        int nameInstance;
                        nameInstance = DatatypeConverter.parseInt(nameElement.getTextContent());
                        operatingSystemFamilyInstance.setName(nameInstance);
                    }
                    
                    Element labelElement = XmlUtility.getElementByTagNameNS(operatingSystemFamiliesElement, "http://schemas.microsoft.com/windowsazure", "Label");
                    if (labelElement != null) {
                        String labelInstance;
                        labelInstance = labelElement.getTextContent() != null ? new String(Base64.decode(labelElement.getTextContent())) : null;
                        operatingSystemFamilyInstance.setLabel(labelInstance);
                    }
                    
                    Element operatingSystemsSequenceElement = XmlUtility.getElementByTagNameNS(operatingSystemFamiliesElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystems");
                    if (operatingSystemsSequenceElement != null) {
                        for (int i2 = 0; i2 < com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(operatingSystemsSequenceElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystem").size(); i2 = i2 + 1) {
                            org.w3c.dom.Element operatingSystemsElement = ((org.w3c.dom.Element) com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(operatingSystemsSequenceElement, "http://schemas.microsoft.com/windowsazure", "OperatingSystem").get(i2));
                            OperatingSystemListFamiliesResponse.OperatingSystem operatingSystemInstance = new OperatingSystemListFamiliesResponse.OperatingSystem();
                            operatingSystemFamilyInstance.getOperatingSystems().add(operatingSystemInstance);
                            
                            Element versionElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "Version");
                            if (versionElement != null) {
                                String versionInstance;
                                versionInstance = versionElement.getTextContent();
                                operatingSystemInstance.setVersion(versionInstance);
                            }
                            
                            Element labelElement2 = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "Label");
                            if (labelElement2 != null) {
                                String labelInstance2;
                                labelInstance2 = labelElement2.getTextContent() != null ? new String(Base64.decode(labelElement2.getTextContent())) : null;
                                operatingSystemInstance.setLabel(labelInstance2);
                            }
                            
                            Element isDefaultElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "IsDefault");
                            if (isDefaultElement != null) {
                                boolean isDefaultInstance;
                                isDefaultInstance = DatatypeConverter.parseBoolean(isDefaultElement.getTextContent().toLowerCase());
                                operatingSystemInstance.setIsDefault(isDefaultInstance);
                            }
                            
                            Element isActiveElement = XmlUtility.getElementByTagNameNS(operatingSystemsElement, "http://schemas.microsoft.com/windowsazure", "IsActive");
                            if (isActiveElement != null) {
                                boolean isActiveInstance;
                                isActiveInstance = DatatypeConverter.parseBoolean(isActiveElement.getTextContent().toLowerCase());
                                operatingSystemInstance.setIsActive(isActiveInstance);
                            }
                        }
                    }
                }
            }
            
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
