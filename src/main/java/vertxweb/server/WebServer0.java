package vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

/**
 * @Author：YangJx
 * @Description：web服务器实例0
 * @DateTime：2018/2/8 22:30
 */
public class WebServer0 extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        router.get("/get").handler(context -> context.response().end("hello get!"));
        router.post("/post").handler(context -> {
            System.out.println(context.request().getParam("id"));
            System.out.println(context.request().getParam("name"));
            context.response().end();
        });
        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
