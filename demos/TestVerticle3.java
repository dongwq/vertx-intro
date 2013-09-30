//TestVerticle3

import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.platform.Verticle;

public class TestVerticle3 extends Verticle {

  public void start() {
    //     * To access the Event Bus API
    //     |          * Register a handler (subscription) to an address
    //     |          | and all messages published will arrive here.
    //     v          v
    vertx.eventBus().registerHandler("random", new Handler<Message<Long>>() {

      @Override
      public void handle(Message<Long> event) {
        //  * The event object contains a body method to access the primitive
        //  | value that was sent. 
        //  |   * The reply method is used to send a message back to the
        //  |   | caller. This is how communication on the eventBus works,
        //  |   | send a message, get a reply, which can be repeated any
        //  |   | number of times until no reply Handler is provided.
        //  |   |                               * event.body() is the message
        //  |   |                               | from the original send call
        //  v   v                               v
        event.reply((long) (Math.random() * event.body()));
      }
    });

    // Do the following every second
    vertx.setPeriodic(1000, new Handler<Long>() {

      @Override
      public void handle(Long event) {
        //                * Send a message to the address random.
        //                |                        * The optional third
        //                |                        | parameter is a Handler
        //                |                        | instance that can receive
        //                |                        | the reply message.
        //                v                        v
        vertx.eventBus().send("random", 1000L, new Handler<Message<Long>>() {

          @Override
          public void handle(Message<Long> event) {
            // Once the reply is received, handle is called, event.body()
            // is the random number sent from the service.
            container.logger().info(
                "Random number from random service: " + event.body());
          }
        });
      }
    });
  }
}	