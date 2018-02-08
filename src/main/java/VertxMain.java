import io.vertx.core.Vertx;

/**
 * @Author：YangJx
 * @Description：利用vertx-core创建服务器
 * @DateTime：2018/1/24 14:22
 */
public class VertxMain {

    public static void main(String[] args) {
        Vertx.vertx().createHttpServer().requestHandler(request -> request.response().end("Hello World!")).listen(8421);
    }

}
