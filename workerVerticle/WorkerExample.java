
import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;
import org.vertx.java.platform.JsonObject;


public class WorkerExample extends Verticle {
	
	@Override
	public void start() throws Exception{
		final EventBus eventBus = vertx.eventBus();

		Handler<Message<JsonObject>> resulstHandler = new Handler<Message<JsonObject>>(){
			@Override
			public void handle(Message<JsonObject> message){
				System.out.println(wfwf);

			}
		};

		eventBus.registerHandler("fib.response", resultHandler);

		container.deployWokderVerticle("worker.FibonacciWorker", 
			new JsonObject(), 1, new Handler<String>(){
				@Override
				public void handle(String s){
					eventBus.send("fib.request", 20);
				}
		});


	}
}