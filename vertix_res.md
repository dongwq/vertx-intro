vertx-intro
==========

## What is Vert.x?
  * Nodejs on JVM.
  
##
## Site
http://vertx.io/install.html

## Video
- introducing Vert.x
  * http://www.parleys.com/play/5148922b0364bc17fc56c8c7/chapter0/agenda
- http://www.slideshare.net/slideshow/embed_code/15643181#
- embeded vert.x into spring
  * http://perfectworldprogramming.com/embed-vert-x-eventbus-into-your-spring-application-with-ease/
- Vert.x: This ain't your Dad's Node.
	* http://www.youtube.com/watch?v=8ClYUo_A3h0


## I like it



## ten reason why use Vert.x??


## Vertx in action


## Vertx in the tide


So you mentioned file system API that are specific, so it’s not the new NIO async handling, I think there are new async API’s in Java 7? 

	The vert.x core has a number of capabilities, we mentioned starting servers and clients but there's also some additional components, there is an EventBus which automatically connects to any other vert.x instances that you start, so you can get very flat predictable horizontal scale, have a queue messaging system built straight into the application. There is a file system API which gives you the same event handling capabilities async stuff as you referred to it, in the same patterns that we use elsewhere to handle HTTP and other functions of the service straight onto the file system, which means that we can do non-blocking activity right away through an application that you build with vert.x which is obviously important because you can block the event loop. 

	If you block the event loop then you stop the thread returning to do useful work elsewhere and typically with these types of event loop non-blocking applications they use many fewer threads than a conventional application container. So we might have hundreds running in a container but maybe ten or twenty running in a non-blocking container, in fact Node famously in that regard is single threaded.


## Application for  
  https://groups.google.com/forum/#!topic/vertx/0bEgdXBsqzQ
  Tim Fox:
   understand your pain. 

I think a set of "Vert.x blueprints" would be really useful. 

I.e. a set of example applications that show you typical kinds of things 
people might want to do with Vert.x, including: 

* REST web application 
* Real-time web application using SockJS/websockets 
* Back office work queue (e.g. order processing) application 
* Web server 
* Messaging server 
* Gaming server 

