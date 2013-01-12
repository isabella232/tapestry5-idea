import org.apache.tapestry5.internal.InternalConstants;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaidJettyLauncher
{
    private final Logger log = LoggerFactory.getLogger(PlaidJettyLauncher.class);

    public static void main(String[] args)
    {
        new PlaidJettyLauncher().run();
    }

    private void run()
    {
        try
        {
            System.setProperty(InternalConstants.TAPESTRY_APP_PACKAGE_PARAM, "com.example.plaid");

            WebAppContext context = new WebAppContext();
            context.setContextPath("/");
            context.setWar("web");

            Server server = new Server(8080);
            server.setHandler(context);

            server.addLifeCycleListener(new AbstractLifeCycle.AbstractLifeCycleListener()
            {
                @Override
                public void lifeCycleStarted(LifeCycle event)
                {
                    log.warn("Jetty ready to accept requests...");
                }
            });

            server.start();
            server.join();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Error launching Jetty", e);
        }
    }
}
