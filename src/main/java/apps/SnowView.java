package apps;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class SnowView {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        WebAppContext ctx = new WebAppContext("src/main/webapp", "/SnowGraph");
        server.setHandler(ctx);
        server.start();
        server.join();
    }
}