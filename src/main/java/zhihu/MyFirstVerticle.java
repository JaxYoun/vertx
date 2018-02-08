package zhihu;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * @Author：YangJx
 * @Description：
 * @DateTime：2018/1/26 13:06
 */
public class MyFirstVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> future) {
        vertx.createHttpServer()
                .requestHandler(
                        request -> request.response().putHeader("content-type", "text/plain").end("Hello World444!")
                ).listen(8080, "127.0.0.4", result -> {
            if (result.succeeded()) {
                future.complete();
            } else {
                future.fail(result.cause());
            }
        });
    }

}
