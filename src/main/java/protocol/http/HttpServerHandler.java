package protocol.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServerHandler {

    public void handler(HttpServletRequest req, HttpServletResponse resp) {
        new HttpServerHandler().handler(req,resp);
    }
}
