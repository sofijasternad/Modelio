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
package org.modelio.uml.ui.dg.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.diagram.api.dg.DGFactory;
import org.modelio.diagram.api.dg.common.PortContainerDG;
import org.modelio.diagram.api.services.DiagramHandle;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.uml.statikdiagram.editor.elements.datatype.GmDataTypePrimaryNode;

/**
 * This class represents the DiagramGraphic of a 'DataType' element.
 */
@objid ("076ab858-377a-47b1-9831-d74073c1ba58")
public class DataTypeDG extends PortContainerDG {
    /**
     * @param diagramHandle The diagram manipulation class.
     * @param node The gm node represented by this class.
     */
    @objid ("61fc544b-cfee-4f6b-afa7-6781e388c326")
    public  DataTypeDG(DiagramHandle diagramHandle, GmNodeModel node) {
        super(diagramHandle, node);
    }

    @objid ("a238eeae-6400-4666-ba32-a95e39f8047f")
    @Override
    protected List<IDiagramNode> getPrimaryChildrenNodes() {
        List<IDiagramNode> nodes = new ArrayList<>();
        
        // Inner nodes
        GmDataTypePrimaryNode mainNode = (GmDataTypePrimaryNode) getPrimaryNode();
        
        // Attributes
        GmCompositeNode attributeZone = mainNode.getCompositeFor(Attribute.class);
        if (attributeZone != null) {
            nodes.addAll(DGFactory.getInstance().getDiagramNodes(this.diagramHandle, attributeZone.getVisibleChildren()));
        }
        
        // Instances
        GmCompositeNode instanceZone = mainNode.getCompositeFor(Instance.class);
        if (instanceZone != null) {
            nodes.addAll(DGFactory.getInstance().getDiagramNodes(this.diagramHandle, instanceZone.getVisibleChildren()));
        }
        
        // Operations
        GmCompositeNode operationZone = mainNode.getCompositeFor(Operation.class);
        if (operationZone != null) {
            nodes.addAll(DGFactory.getInstance().getDiagramNodes(this.diagramHandle, operationZone.getVisibleChildren()));
        }
        return nodes;
    }

}
