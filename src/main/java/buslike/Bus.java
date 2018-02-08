package buslike;

import buslike.controller.First;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

/**
 * @Author：YangJx
 * @Description：启动部署多个服务器实例
 * @DateTime：2018/1/28 0:48
 */
public class Bus {

    public static void main(String[] args) {
        System.out.println("应用启动...");
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle("buslike.controller.*");
        vertx.deployVerticle(new First());
    }

}
