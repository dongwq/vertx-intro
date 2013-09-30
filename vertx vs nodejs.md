
## Problems with NOde.js
- just js
- can't easily scale both vertically and horizontally
- Single event loop fails when you have CPU-intensive tasks or 3rd-party blocking Apis

Vert.x to the rescue
- Use all available cores on a single machine
- Horizontally scale out to multi boxes
- Allow blocking calls to NOT run on a event loop.

Verticles are exttremely isolated
- Verticles are isolated with separate class loaders.
- A verticle never gets executed by more one thread concurrently
- No race conditions, no deadlocks. You write your code as single threaded.

