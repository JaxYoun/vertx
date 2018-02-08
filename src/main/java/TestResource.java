import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

import java.util.Arrays;
import java.util.List;

/**
 * @Author：YangJx
 * @Description：利用vertx-web创建服务器
 * @DateTime：2018/1/24 22:45
 */
public class TestResource extends AbstractVerticle {

    private static List<String> nameList = Arrays.asList("11","22");

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        router.get("/get").handler(request -> request.response().end("hello get!"));
        router.post("/post").handler(request -> request.response().end("hello post!"));
        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stopd");
    }
}
