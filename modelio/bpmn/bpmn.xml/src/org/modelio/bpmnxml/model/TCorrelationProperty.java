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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tCorrelationProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCorrelationProperty">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationPropertyRetrievalExpression" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("056cb65d-be25-440f-8df9-4610d232d0d3")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationProperty", propOrder = {
    "correlationPropertyRetrievalExpression"
})
public class TCorrelationProperty extends TRootElement {
    @objid ("3c4aafad-e662-471e-a0b7-a65f0a5e0bc6")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("bc5c3e4b-207a-4dbf-8b35-f40ed3c8fa8a")
    @XmlElement(required = true)
    protected List<TCorrelationPropertyRetrievalExpression> correlationPropertyRetrievalExpression;

    @objid ("573ee258-675c-49bd-9c50-4bc75ed6eb6e")
    @XmlAttribute(name = "type")
    protected QName type;

    /**
     * Gets the value of the correlationPropertyRetrievalExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationPropertyRetrievalExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCorrelationPropertyRetrievalExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationPropertyRetrievalExpression }
     */
    @objid ("0474562e-cf19-4e01-ba12-0c07e598fd34")
    public List<TCorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression() {
        if (this.correlationPropertyRetrievalExpression == null) {
            this.correlationPropertyRetrievalExpression = new ArrayList<>();
        }
        return this.correlationPropertyRetrievalExpression;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("4859cabf-a0ca-4973-93e4-9d19e33d1786")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("76129cf3-6064-42ae-91fb-0349b31d00a4")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("4081ebb2-13b1-454b-a99b-e3bfe56cd475")
    public QName getType() {
        return this.type;
    }

    /**
     * Sets the value of the type property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("d74ed8f8-7d6a-4859-a24b-006115e81951")
    public void setType(QName value) {
        this.type = value;
    }

}
