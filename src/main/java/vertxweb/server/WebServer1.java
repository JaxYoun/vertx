package vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

/**
 * @Author：YangJx
 * @Description：web服务器实例1
 * @DateTime：2018/2/8 22:30
 */
public class WebServer1 extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        router.get("/get").handler(context -> context.response().end("hello get!"));
        router.post("/post").handler(context -> context.response().end("hello post!"));
        vertx.createHttpServer().requestHandler(router::accept).listen(8081);
    }
}
