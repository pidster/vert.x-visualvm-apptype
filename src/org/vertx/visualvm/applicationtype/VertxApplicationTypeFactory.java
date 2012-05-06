/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vertx.visualvm.applicationtype;

import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.jvm.Jvm;
import com.sun.tools.visualvm.application.type.ApplicationType;
import com.sun.tools.visualvm.application.type.MainClassApplicationTypeFactory;

public class VertxApplicationTypeFactory extends MainClassApplicationTypeFactory {

    @Override
    public ApplicationType createApplicationTypeFor(Application app, Jvm jvm, String mainClass) {

        if ("org.vertx.java.deploy.impl.VertxBoot".equals(mainClass)) {
            return new VertxApplicationType(app.getPid());
        }
        else if ("vert.x-boot.jar".equals(mainClass)) {
            return new VertxApplicationType(app.getPid());
        }
        return null;

    }
}
