package zhihu;

import io.vertx.core.Vertx;

/**
 * @Author：YangJx
 * @Description：利用vertx-core创建服务器，是执行入口，并且可以打包部署
 * @DateTime：2018/1/26 13:04
 */
public class Util {

    public static void main(String[] args) {
        System.out.println("启动");
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }

}
