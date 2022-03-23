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
 * <p>Java class for tBoundaryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBoundaryEvent">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tCatchEvent">
 * &lt;attribute name="cancelActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 * &lt;attribute name="attachedToRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("51a41df5-53ca-43f2-9451-bca157d38abb")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBoundaryEvent")
public class TBoundaryEvent extends TCatchEvent {
    @objid ("74385736-355d-4f82-9a1a-e29cfd80b3ba")
    @XmlAttribute(name = "cancelActivity")
    protected Boolean cancelActivity;

    @objid ("8c83600c-b700-4d23-b064-a9dc9c1b7fcf")
    @XmlAttribute(name = "attachedToRef", required = true)
    protected QName attachedToRef;

    /**
     * Gets the value of the cancelActivity property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("dcd0820a-9e83-4f65-abf5-9a37b0d302d9")
    public boolean isCancelActivity() {
        if (this.cancelActivity == null) {
            return true;
        } else {
            return this.cancelActivity;
        }
        
    }

    /**
     * Sets the value of the cancelActivity property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("545769e0-d35f-449e-aafd-dcc286cf6706")
    public void setCancelActivity(Boolean value) {
        this.cancelActivity = value;
    }

    /**
     * Gets the value of the attachedToRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("5e4520cd-21de-43d5-ac0a-49b3ea1a483c")
    public QName getAttachedToRef() {
        return this.attachedToRef;
    }

    /**
     * Sets the value of the attachedToRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("321dc724-4460-4287-bab2-c9a50024debc")
    public void setAttachedToRef(QName value) {
        this.attachedToRef = value;
    }

}
