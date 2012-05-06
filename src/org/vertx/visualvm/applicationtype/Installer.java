/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vertx.visualvm.applicationtype;

import com.sun.tools.visualvm.application.type.ApplicationTypeFactory;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    private static VertxApplicationTypeFactory INSTANCE = new VertxApplicationTypeFactory();

    @Override
    public void restored() {
        ApplicationTypeFactory.getDefault().registerProvider(INSTANCE);
        VertxViewPluginProvider.initialize();
    }

    @Override
    public void uninstalled() {
        ApplicationTypeFactory.getDefault().unregisterProvider(INSTANCE);
        VertxViewPluginProvider.uninitialize();
    }
}

