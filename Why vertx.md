
## Nodejs on JVM

- c10k problem
- server push
** so from one request/thread to aynsc request

## Buy Nodejs has some shortcomings.
1. js
2. Verticle Scale
3. IPC
4. Event Loop

## So Vert.x
1. polyglot
2. scalable: useing message passing.
3. Concurrent.



## Concurrent
•Verticle instance assigned thread/event loop.
•Verticle instance ALWAYS executes on
assigned thread.
•Verticles have isolated classloaders and
cannot share global state (static members,
global variables, etc.)
•Can write all code assuming single
threading.


## IPC : useing EventBus
Addressing
•Simply a String
•Dot-style namespacing recommended
•e.g. “messages.inbound.A”


## Message Types
•String
•Primitives (int, long, short, float, double, ...)
•Boxed Primitives
•boolean/Boolean
•org.vertx.java.core.json.JsonObject
•org.vertx.java.core.buffer.Buffer


# Distrubuted 
- use hazelcast

# to Browser: websocket
- use Sockjs

## 3.2 Share Immutable Data


# 4 Event Loop

## 4.1 Refractor Pattern
- 4.2 Worker Verticles
- 



## Problem/Solution Summary
- Node.js compels the use of JavaScript
	* Vert.x is Polyglot
- Node.js is inherently single-threaded
   * Vert.x leverages the multi-threaded JVM
- Node.js doesn’t help much w/ interprocess communication
	* Vert.x features a distributed event bus which reaches all the way into the browser
- Node.js requires all code to run on the event loop
	* Vert.x features background workers that allow blocking work to be done off of the event loops