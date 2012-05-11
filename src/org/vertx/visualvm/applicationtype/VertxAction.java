/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vertx.visualvm.applicationtype;

import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.type.ApplicationTypeFactory;
import com.sun.tools.visualvm.core.ui.actions.SingleDataSourceAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class VertxAction extends SingleDataSourceAction<Application> {

    public VertxAction() {
        super(Application.class);
        putValue(Action.NAME, "Show vert.x PID");
        putValue(Action.SHORT_DESCRIPTION, "Demoes a menu item");
    }

    @Override
    protected void actionPerformed(Application application, ActionEvent arg1) {
        JOptionPane.showMessageDialog(null, application.getPid());
    }

    //Here you can determine whether the menu item is enabled,
    //depending on the data source type that is selected. In this
    //example, the menu item is enabled for all types within
    //the current data source:
    @Override
    protected boolean isEnabled(Application application) {
        if (ApplicationTypeFactory.getApplicationTypeFor(application) instanceof VertxApplicationType) {
            return true;
        }
        return false;
    }
}

