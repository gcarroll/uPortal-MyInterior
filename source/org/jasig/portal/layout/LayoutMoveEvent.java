/* Copyright 2002 The JA-SIG Collaborative.  All rights reserved.
*  See license distributed with this file and
*  available online at http://www.uportal.org/license.html
*/

package org.jasig.portal.layout;

/**
 * A layout event involving old parent reference. 
 * Used to related "move" and "delete" node events.
 *
 * @author <a href="mailto:pkharchenko@interactivebusiness.com">Peter Kharchenko</a>
 * @version 1.0
 */
public class LayoutMoveEvent extends LayoutEvent {
    protected String oldParentNodeId;

    /**
     * Construct a <code>LayoutMoveEvent</code> from a given source,
     * node, and node's old parent.
     *
     * @param source an <code>Object</code> that generated the event
     * @param node an <code>UserLayoutNodeDescription</code> of the node that was involved
     * @param oldParentNodeId a <code>String</code> value of an old parent id
     */
    public LayoutMoveEvent(Object source,IUserLayoutNodeDescription node, String oldParentNodeId) {
        super(source,node);
        this.oldParentNodeId=oldParentNodeId;
    }
    
    /**
     * Obtain an id of an OLD parent node.  This is the node
     * to which a given node used to be attached.
     *
     * @return a <code>String</code> node id
     */
    public String getOldParentNodeId() {
        return this.oldParentNodeId;
    }
}

