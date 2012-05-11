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
import com.sun.tools.visualvm.core.ui.DataSourceViewPlugin;
import com.sun.tools.visualvm.core.ui.components.DataViewComponent;
import com.sun.tools.visualvm.core.ui.components.ScrollableContainer;
import javax.swing.JPanel;

/**
 *
 * @author geertjan
 */
public class VertxOverview extends DataSourceViewPlugin {

    VertxOverview(Application application) {
        super(application);
    }

    @Override
    public DataViewComponent.DetailsView createView(int location) {
        switch (location) {
            case DataViewComponent.TOP_RIGHT:
                JPanel panel = new JPanel();
                return new DataViewComponent.DetailsView("User Interface", null, 30,
                        new ScrollableContainer(panel), null);
            default:
                return null;
        }
    }
}
