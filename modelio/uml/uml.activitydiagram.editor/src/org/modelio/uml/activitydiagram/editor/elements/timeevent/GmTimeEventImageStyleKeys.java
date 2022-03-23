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
package org.modelio.uml.activitydiagram.editor.elements.timeevent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.uml.activitydiagram.editor.style.ActivityAbstractStyleKeyProvider;

/**
 * This class provides the StyleKey constants for a GmTimeEvent when its representation mode is RepresentationMode.IMAGE
 */
@objid ("2b608bfe-55b6-11e2-877f-002564c97630")
public class GmTimeEventImageStyleKeys extends ActivityAbstractStyleKeyProvider {
    @objid ("d29cb23a-55c0-11e2-9337-002564c97630")
    static final StyleKey REPMODE = GmTimeEventStructuredStyleKeys.REPMODE;

    @objid ("d29cb23c-55c0-11e2-9337-002564c97630")
    static final StyleKey FONT = GmTimeEventStructuredStyleKeys.FONT;

    @objid ("d29cb23e-55c0-11e2-9337-002564c97630")
    static final StyleKey TEXTCOLOR = GmTimeEventStructuredStyleKeys.TEXTCOLOR;

    @objid ("d29cb240-55c0-11e2-9337-002564c97630")
    static final StyleKey SHOWSTEREOTYPES = GmTimeEventStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("d29cb242-55c0-11e2-9337-002564c97630")
    static final StyleKey SHOWTAGS = GmTimeEventStructuredStyleKeys.SHOWTAGS;

    @objid ("d29cb244-55c0-11e2-9337-002564c97630")
    static final StyleKey AUTOSHOWPINS = GmTimeEventStructuredStyleKeys.AUTOSHOWPINS;

}
