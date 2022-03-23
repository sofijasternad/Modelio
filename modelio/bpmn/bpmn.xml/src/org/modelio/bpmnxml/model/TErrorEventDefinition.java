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
 * <p>Java class for tErrorEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tErrorEventDefinition">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition">
 * &lt;attribute name="errorRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("acc8c774-0ceb-4aa0-b004-71c9b4d1174e")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tErrorEventDefinition")
public class TErrorEventDefinition extends TEventDefinition {
    @objid ("c1d082f1-c869-422c-a206-84e485b2f3d9")
    @XmlAttribute(name = "errorRef")
    protected QName errorRef;

    /**
     * Gets the value of the errorRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("23b4abaa-d815-4717-8c07-fdc7c2f4bfaa")
    public QName getErrorRef() {
        return this.errorRef;
    }

    /**
     * Sets the value of the errorRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("5faeae71-a646-495d-b564-fd2ae474bbc1")
    public void setErrorRef(QName value) {
        this.errorRef = value;
    }

}
