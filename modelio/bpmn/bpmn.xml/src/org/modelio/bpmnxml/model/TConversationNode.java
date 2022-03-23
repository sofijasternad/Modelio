/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tConversationNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tConversationNode">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="messageFlowRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("b1ee2413-183b-41b9-9d43-6e41ba3964d0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tConversationNode", propOrder = {
    "participantRef",
    "messageFlowRef",
    "correlationKey"
})
@XmlSeeAlso({
    TSubConversation.class,
    TCallConversation.class,
    TConversation.class
})
public abstract class TConversationNode extends TBaseElement {
    @objid ("970dc11f-dfb2-4bc8-80e8-90b4e7ec4a99")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("b9ffc1ab-5998-4e21-b90d-c3960738ff55")
    protected List<QName> participantRef;

    @objid ("93e749e5-4c30-447c-bf66-9d2bae65f071")
    protected List<QName> messageFlowRef;

    @objid ("5565fa98-4529-4472-84ec-4a08981deaf5")
    protected List<TCorrelationKey> correlationKey;

    /**
     * Gets the value of the participantRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getParticipantRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("e27a2d34-f000-4cce-998d-4fcacbc797d3")
    public List<QName> getParticipantRef() {
        if (this.participantRef == null) {
            this.participantRef = new ArrayList<>();
        }
        return this.participantRef;
    }

    /**
     * Gets the value of the messageFlowRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFlowRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getMessageFlowRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("bafc61b3-d60f-4b9c-bff3-4edfd8ce34fe")
    public List<QName> getMessageFlowRef() {
        if (this.messageFlowRef == null) {
            this.messageFlowRef = new ArrayList<>();
        }
        return this.messageFlowRef;
    }

    /**
     * Gets the value of the correlationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCorrelationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationKey }
     */
    @objid ("22c66838-8376-464d-ab82-9b9cc4b3ee19")
    public List<TCorrelationKey> getCorrelationKey() {
        if (this.correlationKey == null) {
            this.correlationKey = new ArrayList<>();
        }
        return this.correlationKey;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("5cc1daec-e7ec-4bc1-81da-38ebe86485a0")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("366c1ddf-806b-40e2-aedc-b8bf05983a8a")
    public void setName(String value) {
        this.name = value;
    }

}
