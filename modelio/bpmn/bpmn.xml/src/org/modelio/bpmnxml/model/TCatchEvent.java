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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tCatchEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCatchEvent">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEvent">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutput" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutputAssociation" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}outputSet" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}eventDefinition" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="eventDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="parallelMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("c49320bf-6ead-43d0-96c5-b3b65fc3b07b")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCatchEvent", propOrder = {
    "dataOutput",
    "dataOutputAssociation",
    "outputSet",
    "eventDefinition",
    "eventDefinitionRef"
})
@XmlSeeAlso({
    TStartEvent.class,
    TBoundaryEvent.class,
    TIntermediateCatchEvent.class
})
public abstract class TCatchEvent extends TEvent {
    @objid ("5c52e4a5-864c-443c-8772-d065631af6d4")
    @XmlAttribute(name = "parallelMultiple")
    protected Boolean parallelMultiple;

    @objid ("4faff6da-8d81-4ffc-9d0e-379894f57665")
    protected List<TDataOutput> dataOutput;

    @objid ("ec491fa8-4881-4fa1-bd4a-a14222849b5c")
    protected List<TDataOutputAssociation> dataOutputAssociation;

    @objid ("f92c5490-c231-4eff-8f60-507cfbe72dc2")
    protected TOutputSet outputSet;

    @objid ("28584909-d9f3-4fe1-949f-93e1ef06a872")
    @XmlElementRef(name = "eventDefinition", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TEventDefinition>> eventDefinition;

    @objid ("c923cb0b-d6e3-4b27-88d9-f84cabe0fabf")
    protected List<QName> eventDefinitionRef;

    /**
     * Gets the value of the dataOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getDataOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataOutput }
     */
    @objid ("5bb56aec-4088-4031-8afa-665a37dfaa61")
    public List<TDataOutput> getDataOutput() {
        if (this.dataOutput == null) {
            this.dataOutput = new ArrayList<>();
        }
        return this.dataOutput;
    }

    /**
     * Gets the value of the dataOutputAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutputAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getDataOutputAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataOutputAssociation }
     */
    @objid ("88b12b33-9599-4e24-9722-61715d276fd1")
    public List<TDataOutputAssociation> getDataOutputAssociation() {
        if (this.dataOutputAssociation == null) {
            this.dataOutputAssociation = new ArrayList<>();
        }
        return this.dataOutputAssociation;
    }

    /**
     * Gets the value of the outputSet property.
     * @return
     * possible object is
     * {@link TOutputSet }
     */
    @objid ("3d4c6ef3-c5f9-4408-b3fa-752d0805a0e8")
    public TOutputSet getOutputSet() {
        return this.outputSet;
    }

    /**
     * Sets the value of the outputSet property.
     * @param value allowed object is
     * {@link TOutputSet }
     */
    @objid ("741b3d1c-47f9-4f20-ac2f-b47ee4c7171f")
    public void setOutputSet(TOutputSet value) {
        this.outputSet = value;
    }

    /**
     * Gets the value of the eventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     */
    @objid ("e65d45e5-6781-4e87-944c-f92f481b8904")
    public List<JAXBElement<? extends TEventDefinition>> getEventDefinition() {
        if (this.eventDefinition == null) {
            this.eventDefinition = new ArrayList<>();
        }
        return this.eventDefinition;
    }

    /**
     * Gets the value of the eventDefinitionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinitionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getEventDefinitionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("5e67ef51-7980-4932-af35-9c974d87ae7a")
    public List<QName> getEventDefinitionRef() {
        if (this.eventDefinitionRef == null) {
            this.eventDefinitionRef = new ArrayList<>();
        }
        return this.eventDefinitionRef;
    }

    /**
     * Gets the value of the parallelMultiple property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("18ca45a7-b693-4bd1-8da0-1583e44fdd90")
    public boolean isParallelMultiple() {
        if (this.parallelMultiple == null) {
            return false;
        } else {
            return this.parallelMultiple;
        }
        
    }

    /**
     * Sets the value of the parallelMultiple property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("dc7babaa-18bc-477b-85d4-68393ec1f92d")
    public void setParallelMultiple(Boolean value) {
        this.parallelMultiple = value;
    }

}
