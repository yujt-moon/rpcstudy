package provider;

import org.apache.log4j.Logger;
import protocol.http.HttpServer;

public class Provider {

    private static Logger logger = Logger.getLogger(Provider.class);

    public static void main(String[] args) {
        logger.warn("启动应用！");
        // 1. 本地注册

        // 2. 远程注册

        // 3. 启动tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start("localhost", 8080);
    }
}
