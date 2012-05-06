/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
