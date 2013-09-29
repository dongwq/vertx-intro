// file :TestVerticle2

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class TestVerticle2 extends Verticle {

  public void start() {
//     * vertx Variable comes from the Verticle class that TestVerticle2
//     | extends. From here we have access to the rich Async APIs that
//     | Vert.x provides. This is anywhere from network clients, servers
//     | file I/O, timers and the shared data structures.
//     v
    vertx.createHttpServer()
//                           * Here's where the Async concepts become
//                           | clearly visible. There are optional
//                           | methods on most of the API's the provide
//                           | a user to pass in a callback.
//                           v
        .requestHandler(new Handler<HttpServerRequest>() {

//           * The APIs are designed with Java 8 and other languages
//           | that support "functional interfaces" that is interfaces
//           | with a single method. Languages like Java 8 and Groovy
//           | can instead use a type-hinted closure instead of all
//           | of the usual boiler plate code.
//           v
          @Override
          public void handle(HttpServerRequest request) {
//             * The response is part of the request object
//             | think of this as similar streamlining we get
//             | from the concepts behind Vert.x - to present
//             | a simpler application development platform.
//             | This is a concept Node.js started, and Vert.x
//             | takes to heart.
//             |                * For more methods available in the
//             |                | Vert.x API, please see the manual.
//             v                v
            request.response().end("Thanks!");
          }

        }).listen(8080);    
    vertx.setTimer(1000, new Handler<Long>() {
      
      @Override
      public void handle(Long event) {
        container.logger().info("1 second elapsed");
      }
    });
  }
}