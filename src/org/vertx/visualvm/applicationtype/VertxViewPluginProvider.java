package org.vertx.visualvm.applicationtype;

import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.type.ApplicationTypeFactory;
import com.sun.tools.visualvm.application.views.ApplicationViewsSupport;
import com.sun.tools.visualvm.core.ui.DataSourceViewPlugin;
import com.sun.tools.visualvm.core.ui.DataSourceViewPluginProvider;

/**
 *
 * @author Jiri Sedlacek
 */
class VertxViewPluginProvider extends DataSourceViewPluginProvider<Application> {

    @Override
    protected DataSourceViewPlugin createPlugin(Application application) {
        return new VertxOverview(application);
    }

    @Override
    protected boolean supportsPluginFor(Application application) {
        if (ApplicationTypeFactory.getApplicationTypeFor(application) instanceof VertxApplicationType) {
            return true;
        }
        return false;
    }

    static void initialize() {
        ApplicationViewsSupport.sharedInstance().getOverviewView().
                registerPluginProvider(new VertxViewPluginProvider());
    }

    static void uninitialize() {
        ApplicationViewsSupport.sharedInstance().getMonitorView().unregisterPluginProvider(new VertxViewPluginProvider());
    }
}
