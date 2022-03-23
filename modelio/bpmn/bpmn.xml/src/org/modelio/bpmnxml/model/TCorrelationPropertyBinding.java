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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tCorrelationPropertyBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCorrelationPropertyBinding">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="dataPath" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression"/>
 * &lt;/sequence>
 * &lt;attribute name="correlationPropertyRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("c8f9d9bd-ca5e-401e-92da-5f8a06dcfd76")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationPropertyBinding", propOrder = {
    "dataPath"
})
public class TCorrelationPropertyBinding extends TBaseElement {
    @objid ("bf208c6a-8170-4a58-a861-03198ab2ef32")
    @XmlElement(required = true)
    protected TFormalExpression dataPath;

    @objid ("1755ec2c-3b5e-4fcb-b7ff-8d01e63f3ad0")
    @XmlAttribute(name = "correlationPropertyRef", required = true)
    protected QName correlationPropertyRef;

    /**
     * Gets the value of the dataPath property.
     * @return
     * possible object is
     * {@link TFormalExpression }
     */
    @objid ("f4616565-9e2c-4a35-a3ab-0946c47c15c2")
    public TFormalExpression getDataPath() {
        return this.dataPath;
    }

    /**
     * Sets the value of the dataPath property.
     * @param value allowed object is
     * {@link TFormalExpression }
     */
    @objid ("f42cf827-7d9f-40ac-94e6-84e49faa3189")
    public void setDataPath(TFormalExpression value) {
        this.dataPath = value;
    }

    /**
     * Gets the value of the correlationPropertyRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("9d2c5e67-051a-4040-ac3c-86c71fae6d93")
    public QName getCorrelationPropertyRef() {
        return this.correlationPropertyRef;
    }

    /**
     * Sets the value of the correlationPropertyRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("2227a11a-a57d-4f00-b8c7-fed8ac4fe9cd")
    public void setCorrelationPropertyRef(QName value) {
        this.correlationPropertyRef = value;
    }

}
