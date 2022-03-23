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
package org.modelio.uml.activitydiagram.editor.elements.inputpin;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.uml.activitydiagram.editor.style.ActivityAbstractStyleKeyProvider;

/**
 * This class provides the StyleKey constants for a GmInputPin when its representation mode is RepresentationMode.IMAGE
 */
@objid ("2aaaa980-55b6-11e2-877f-002564c97630")
public class GmInputPinImageStyleKeys extends ActivityAbstractStyleKeyProvider {
    @objid ("d221198b-55c0-11e2-9337-002564c97630")
    static final StyleKey REPMODE = GmInputPinStructuredStyleKeys.REPMODE;

    @objid ("d221198d-55c0-11e2-9337-002564c97630")
    static final StyleKey FONT = GmInputPinStructuredStyleKeys.FONT;

    @objid ("d221198f-55c0-11e2-9337-002564c97630")
    static final StyleKey TEXTCOLOR = GmInputPinStructuredStyleKeys.TEXTCOLOR;

    @objid ("d2211991-55c0-11e2-9337-002564c97630")
    static final StyleKey SHOWSTEREOTYPES = GmInputPinStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("d2211993-55c0-11e2-9337-002564c97630")
    static final StyleKey SHOWTAGS = GmInputPinStructuredStyleKeys.SHOWTAGS;

}
