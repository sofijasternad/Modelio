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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tSendTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSendTask">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tTask">
 * &lt;attribute name="implementation" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplementation" default="##WebService" />
 * &lt;attribute name="messageRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="operationRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("7dbcd438-ad12-46b8-bf84-a316391f7c32")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSendTask")
public class TSendTask extends TTask {
    @objid ("c3f6e4fe-ef90-4407-9c4d-1c0d4808fc84")
    @XmlAttribute(name = "implementation")
    protected String implementation;

    @objid ("e23fe413-c907-464a-9870-e5bede42be0d")
    @XmlAttribute(name = "messageRef")
    protected QName messageRef;

    @objid ("1af07957-e042-49a7-9267-02025d32dcfd")
    @XmlAttribute(name = "operationRef")
    protected QName operationRef;

    /**
     * Gets the value of the implementation property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("29439b40-efc3-4c57-b1cd-b23820919c09")
    public String getImplementation() {
        if (this.implementation == null) {
            return "##WebService";
        } else {
            return this.implementation;
        }
        
    }

    /**
     * Sets the value of the implementation property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("7e36cf53-b781-461d-8ae9-8f522b53f58b")
    public void setImplementation(String value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the messageRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("0d070a83-c3bd-43b3-856e-8c66d03b3b90")
    public QName getMessageRef() {
        return this.messageRef;
    }

    /**
     * Sets the value of the messageRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("2d9018d4-ea59-4cde-8eb3-ae5b0a876d49")
    public void setMessageRef(QName value) {
        this.messageRef = value;
    }

    /**
     * Gets the value of the operationRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("bf7d79be-b837-422b-95bc-b2f37ac49d50")
    public QName getOperationRef() {
        return this.operationRef;
    }

    /**
     * Sets the value of the operationRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("ec85d481-7e8f-4ee8-bd6d-6124afeeb58d")
    public void setOperationRef(QName value) {
        this.operationRef = value;
    }

}
