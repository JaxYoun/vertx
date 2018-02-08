package vertxweb;

import io.vertx.core.Vertx;
import vertxweb.server.WebServer0;
import vertxweb.server.WebServer1;

/**
 * @Author：YangJx
 * @Description：
 * @DateTime：2018/2/8 22:29
 */
public class WebMain {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(WebServer0.class.getName());
        vertx.deployVerticle(WebServer1.class.getName());
        System.out.println("启完成...");
    }
}
