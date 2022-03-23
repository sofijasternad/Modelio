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
 * <p>Java class for tInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInterface">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}operation" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="implementationRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("8a536152-70be-4638-a991-0a14b14ce7d0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInterface", propOrder = {
    "operation"
})
public class TInterface extends TRootElement {
    @objid ("3ddc8937-68b6-45e7-8d4e-22aa2a5a7426")
    @XmlAttribute(name = "name", required = true)
    protected String name;

    @objid ("d9db0198-3106-452e-aebc-400b7f49aa78")
    @XmlElement(required = true)
    protected List<TOperation> operation;

    @objid ("3f53c583-90ca-492e-9e33-4ac03178838e")
    @XmlAttribute(name = "implementationRef")
    protected QName implementationRef;

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOperation }
     */
    @objid ("9b661f8c-bc50-4a49-bad3-eee8e350afca")
    public List<TOperation> getOperation() {
        if (this.operation == null) {
            this.operation = new ArrayList<>();
        }
        return this.operation;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("e0e638b6-d9a1-4eba-8178-217f3c7b6c40")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("c1713d31-ace0-459e-bd58-d20bfcd9f759")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the implementationRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("212baf78-8051-4057-b699-66a12e4663b4")
    public QName getImplementationRef() {
        return this.implementationRef;
    }

    /**
     * Sets the value of the implementationRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("fb3d450d-028c-4e30-857f-90acf3852aa8")
    public void setImplementationRef(QName value) {
        this.implementationRef = value;
    }

}
