# Multi Client Chat Server
This project includes the server code and the client code to create a Multi Client Chat Server using socket programming. This was the final project in my Computer Communication Network class. It includes a report that explains exactly how the code runs. 

This code was run on the windows command prompt, with the client program and the server program being run in different application windows simultaneously on the same machine. Both programs must be run simultaneously in order to connect the sockets. If the server program does not detect the client
program, it will continue to say “Waiting for Connection...” and will not run.

The server side of the program waits until the client side is detected, then establishes a connection and prompts the server to wait until a message is received in order to reply. It should be noted that the client is identified by their IP Address and TCP port, allowing multiple clients to be
differentiated by their identifiers.

Client2.java was included to show a second client interacting with both the first client and the server. 
