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


package com.google.api.ads.dfp.jaxws.v201705;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Synchronizes the local {@link Proposal} with the latest version in
 *             Marketplace.
 *             This action is only to be used in cases where a {@link RequestBuyerAcceptance} action is being
 *             performed, but the buyer has made updates that have not yet been picked up by DFP. In this case
 *             a {@link DealError#PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE} error will be thrown. This action is
 *             used to tell DFP to pick up the buyer changes immediately.
 *           
 * 
 * <p>Java class for SyncProposalsWithMarketplace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncProposalsWithMarketplace">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201705}ProposalAction">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncProposalsWithMarketplace")
public class SyncProposalsWithMarketplace
    extends ProposalAction
{


}
