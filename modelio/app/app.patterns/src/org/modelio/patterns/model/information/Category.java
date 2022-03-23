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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.07.19 at 01:40:57 PM CEST
//
package org.modelio.patterns.model.information;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Category complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Category">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="SubCategorie" type="{}Category" minOccurs="0"/>
 * &lt;/all>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="image" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("f5e3d1b5-766c-4321-98fa-b22d19559378")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {

})
public class Category {
    @objid ("e1cbb18b-55fe-4446-ae32-c217cc88dd68")
    @XmlAttribute
    protected String name;

    @objid ("33eda837-eed7-4945-850a-4f2c011332e5")
    @XmlAttribute
    protected String description;

    @objid ("01f1a62b-0f04-493e-ba8a-269088c7e40f")
    @XmlAttribute
    protected String image;

    @objid ("550639c1-df9f-48d6-9ed8-8d5c27044e16")
    @XmlElement(name = "SubCategorie")
    protected Category subCategory;

    /**
     * Gets the value of the subCategorie property.
     * @return possible object is {@link Category }
     */
    @objid ("a7750965-5ab6-4915-8539-a7b224fffd19")
    public Category getSubCategory() {
        return this.subCategory;
    }

    /**
     * Sets the value of the subCategorie property.
     * @param value allowed object is {@link Category }
     */
    @objid ("e93de807-2b8d-4bb1-a994-ca2c50487f3f")
    public void setSubCategory(Category value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the name property.
     * @return possible object is {@link String }
     */
    @objid ("95c74c23-51ed-4d01-abff-393a8a01c239")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is {@link String }
     */
    @objid ("423bc5cf-53c2-459e-98b8-bede8f5f0b32")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * @return possible object is {@link String }
     */
    @objid ("bee1eb87-ba89-4853-9e2e-42116a1d372a")
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the value of the description property.
     * @param value allowed object is {@link String }
     */
    @objid ("cc544455-b25b-49e9-9cdf-767ca07a787f")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the image property.
     * @return possible object is {@link String }
     */
    @objid ("99207ae9-ac8b-4b29-a9ab-d4715371860d")
    public String getImage() {
        return this.image;
    }

    /**
     * Sets the value of the image property.
     * @param value allowed object is {@link String }
     */
    @objid ("770df913-7d1e-41ba-9aa5-d5cb8382d571")
    public void setImage(String value) {
        this.image = value;
    }

}
