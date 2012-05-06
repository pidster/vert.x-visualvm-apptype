/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vertx.visualvm.applicationtype;

import com.sun.tools.visualvm.application.type.ApplicationType;
import java.awt.Image;
import org.openide.util.ImageUtilities;

public class VertxApplicationType extends ApplicationType {

    protected final int appPID;

    public VertxApplicationType(int pid) {
        appPID = pid;
    }

    @Override
    public String getName() {
        return "vert.x";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "Application type for vert.x";
    }

    @Override
    public Image getIcon() {
        return ImageUtilities.loadImage("com/sun/tools/visualvm/core/ui/resources/snapshot.png", true);
    }
}
