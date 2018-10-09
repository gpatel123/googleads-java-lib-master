// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201702.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to manage extensions at the adgroup level. The extensions are managed by AdWords
 *       using existing feed services, including creating and modifying feeds, feed items, and adgroup
 *       feeds for the user.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupExtensionSettingServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupExtensionSettingServiceInterface {


    /**
     * 
     *         Returns a list of AdGroupExtensionSettings that meet the selector criteria.
     *         
     *         @param selector Determines which AdGroupExtensionSettings to return. If empty, all
     *         AdGroupExtensionSettings are returned.
     *         @return The list of AdGroupExtensionSettings specified by the selector.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingServiceInterfacegetResponse")
    public AdGroupExtensionSettingPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations (add, remove, and set).
     *         
     *         <p> Beginning in v201509, add and set operations are treated identically. Performing an add
     *         operation on an ad group with an existing ExtensionSetting will cause the operation to be
     *         treated like a set operation. Performing a set operation on an ad group with no
     *         ExtensionSetting will cause the operation to be treated like an add operation.
     *         
     *         @param operations The operations to apply. The same {@link AdGroupExtensionSetting} cannot be
     *         specified in more than one operation.
     *         @return The changed {@link AdGroupExtensionSetting}s.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingServiceInterfacemutateResponse")
    public AdGroupExtensionSettingReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
        List<AdGroupExtensionSettingOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of AdGroupExtensionSettings that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return The list of AdGroupExtensionSettings specified by the query.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.AdGroupExtensionSettingServiceInterfacequeryResponse")
    public AdGroupExtensionSettingPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
        String query)
        throws ApiException_Exception
    ;

}
