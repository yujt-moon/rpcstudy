package provider;

import protocol.http.HttpServer;

public class Provider {
    public static void main(String[] args) {
        // 1. 本地注册

        // 2. 远程注册

        // 3. 启动tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start("localhost", 8080);
    }
}
