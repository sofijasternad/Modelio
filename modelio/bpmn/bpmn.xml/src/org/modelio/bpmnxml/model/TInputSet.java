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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for tInputSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInputSet">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="dataInputRefs" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="optionalInputRefs" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="whileExecutingInputRefs" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="outputSetRefs" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("a5c5901a-ce65-4c5b-a23d-03f0ea5458b5")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInputSet", propOrder = {
    "dataInputRefs",
    "optionalInputRefs",
    "whileExecutingInputRefs",
    "outputSetRefs"
})
public class TInputSet extends TBaseElement {
    @objid ("5642afc3-0d3a-4d44-8555-f592479081e2")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("46e3025f-b400-4ef3-9302-85dc8b0b17c4")
    @XmlElementRef(name = "dataInputRefs", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> dataInputRefs;

    @objid ("718bd7f6-18ef-4f37-823f-7091873c4125")
    @XmlElementRef(name = "optionalInputRefs", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> optionalInputRefs;

    @objid ("1074d8ed-52a7-45cd-950d-b198156d66fd")
    @XmlElementRef(name = "whileExecutingInputRefs", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> whileExecutingInputRefs;

    @objid ("29bbdc60-91f3-4683-a752-13b124da511a")
    @XmlElementRef(name = "outputSetRefs", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> outputSetRefs;

    /**
     * Gets the value of the dataInputRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInputRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getDataInputRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @objid ("7d5f88a2-ef58-408c-a1c9-36f9e9885ffe")
    public List<JAXBElement<Object>> getDataInputRefs() {
        if (this.dataInputRefs == null) {
            this.dataInputRefs = new ArrayList<>();
        }
        return this.dataInputRefs;
    }

    /**
     * Gets the value of the optionalInputRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalInputRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getOptionalInputRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @objid ("4c4d8bd0-becf-46e1-b317-983a5ab67c97")
    public List<JAXBElement<Object>> getOptionalInputRefs() {
        if (this.optionalInputRefs == null) {
            this.optionalInputRefs = new ArrayList<>();
        }
        return this.optionalInputRefs;
    }

    /**
     * Gets the value of the whileExecutingInputRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whileExecutingInputRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getWhileExecutingInputRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @objid ("b34bc7c6-f46a-414b-9d3b-a58cadb9dd0a")
    public List<JAXBElement<Object>> getWhileExecutingInputRefs() {
        if (this.whileExecutingInputRefs == null) {
            this.whileExecutingInputRefs = new ArrayList<>();
        }
        return this.whileExecutingInputRefs;
    }

    /**
     * Gets the value of the outputSetRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSetRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getOutputSetRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @objid ("d6751a18-2ab4-4d44-a40f-19e6d8490771")
    public List<JAXBElement<Object>> getOutputSetRefs() {
        if (this.outputSetRefs == null) {
            this.outputSetRefs = new ArrayList<>();
        }
        return this.outputSetRefs;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("bfe125b6-d7d9-4d4e-8897-ed64a0e3107e")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("e9a5d0fb-7bd0-482c-9643-8de7cee834c2")
    public void setName(String value) {
        this.name = value;
    }

}
