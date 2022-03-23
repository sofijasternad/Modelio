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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for tGlobalUserTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGlobalUserTask">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGlobalTask">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}rendering" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="implementation" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplementation" default="##unspecified" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("5facdbfa-3ed3-4133-9cc2-4a7a2549fbf4")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGlobalUserTask", propOrder = {
    "rendering"
})
public class TGlobalUserTask extends TGlobalTask {
    @objid ("60b109a1-8e0f-4eb7-82e0-fa00d12d6157")
    @XmlAttribute(name = "implementation")
    protected String implementation;

    @objid ("689d2bf5-79e1-4898-9bd4-8b3ee1952ee3")
    protected List<TRendering> rendering;

    /**
     * Gets the value of the rendering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rendering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getRendering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRendering }
     */
    @objid ("fa69221e-9077-4c7f-a9bf-2f6219155bd5")
    public List<TRendering> getRendering() {
        if (this.rendering == null) {
            this.rendering = new ArrayList<>();
        }
        return this.rendering;
    }

    /**
     * Gets the value of the implementation property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("4a48606d-a204-4d4f-80dc-af0a5763cfa0")
    public String getImplementation() {
        if (this.implementation == null) {
            return "##unspecified";
        } else {
            return this.implementation;
        }
        
    }

    /**
     * Sets the value of the implementation property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("424a7b96-428a-419d-8d9c-37a24e411f69")
    public void setImplementation(String value) {
        this.implementation = value;
    }

}
