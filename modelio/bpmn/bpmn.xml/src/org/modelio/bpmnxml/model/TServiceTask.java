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
 * <p>Java class for tServiceTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tServiceTask">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tTask">
 * &lt;attribute name="implementation" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplementation" default="##WebService" />
 * &lt;attribute name="operationRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("5c5593a4-3fe1-40db-8d82-747779f8effa")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServiceTask")
public class TServiceTask extends TTask {
    @objid ("e3486394-befc-449d-8fa5-1e753bd91c7d")
    @XmlAttribute(name = "implementation")
    protected String implementation;

    @objid ("ad58bc88-9ea6-4918-be15-d327323ed85f")
    @XmlAttribute(name = "operationRef")
    protected QName operationRef;

    /**
     * Gets the value of the implementation property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("d4f3f6fb-357e-4bd9-b8e5-ec9ad28a8eb9")
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
    @objid ("0639b769-30a1-4ea9-addb-da0fabd6fdd9")
    public void setImplementation(String value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the operationRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("cbfb4405-201b-4ae8-b8fc-a4a6aa6b8748")
    public QName getOperationRef() {
        return this.operationRef;
    }

    /**
     * Sets the value of the operationRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("ce7b590a-6ac3-4dc5-8178-b160ba8c1b4d")
    public void setOperationRef(QName value) {
        this.operationRef = value;
    }

}
