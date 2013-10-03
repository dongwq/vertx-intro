
import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;
import org.vertx.java.platform.JsonObject;

public class FibonacciWorkder extends Verticle{

	@Override
	public void start() throws Exception{
		final EventBus eventBus = vertx.eventBus();

		eventBus.registerhandler( "fib.request",  new Handler<HttpServerRequest>(){
			@Override
			public void Handler(Message<Integer>  msg){
				Integer result = fib( msg.body.intValue());
				JsonObject	resultMessage = new JsonObject();

				resultMessage.putString("number", message.body.toString());
				eventBus.send("fib.response", resultMessage);
				
			}
			
		}).
	}

	private int fib(int number){
		if (number == 0) return 0;
		else if(number == 1) return 1;
		else{
			return fib(i-2) + fib(i-1);
		}

	}
}