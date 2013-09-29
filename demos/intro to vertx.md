

## What is it good for?
-


## Verticles
- A verticle is the exec unit of Vert.x
- Application composed of Many Verticles.
- Verticles communicate by message passing.
- verticles provide isolation

## Why Async?
- Long lived conn
- OS Threads are precious Res.
- Need to service manay with small thread

## Event loops
- Multi Reactor
- an event loop is an OS Thread.
- 
- Don't block the event loop.

COncuurency Model
- A verticlel instance is single threaded
- move away from java-style multi=threaded concurrency
- No more synchronized, volatile and 
- say gooed by to 

Scaling
- Scale by creating more Verticle instances.
- Use messsage passing to communicate.
- Sound like the Actor Model? it' similar
- For tcp/http servers Vert.x will automatically load-balance


## The Futrue
- Scala and Clojure support.
- Management, in cluding GUI console.
- Dev exp- IDE int, testing
