# OAuth2 Symetric JWT

## What is JWT ?
Json Web Token is a solution for implementing a token which ensure secure and trust communication between applications.
JWT allow claims, such as user data, to be represented in a secure manner. A Json web token is just a json object. Every JWT has 3 parts. Header , payload and signature. We are going to focus on the third one.

## What is Symetric JWT then ?
Symetric JWT is kind of implementation of a way apps connect between each other in a secure way. As we said before, every JWT has encrypted signature which is secret and only the application on the other edge should know it to make sure the JWT does not come from unwanted source (i.e. attacker). It requires the edge apps to hold the secret key and when it comes to the authorization app retrieve the token and check if it is correct by secret signature.
Let's take a look on a quick simple example.
![enter image description here](https://miro.medium.com/max/1284/1*lhvbwO2pisfmEoFtw3GUjw.png)

## Common problems

 - When we want to change our signature we have to inform all of our apps. 
Just imagine how much time it takes to change the same secret key in 1000 of apps using it.
- Is it really secure ? As long as our signature key is not know to anybody it is. But let's say that someone somehow discovered our secret key. Now he can get to any of our 1000.


## Summary
OAuth2 flow is an interesting topic. I do recommend to read more about it, because security is really important topic nowadays.
Feel free to download the code, to test it and play with it.
There are some hints.

If you do not want to download the whole code and run it.
You can just start those two containers. And start playing with it.

	
The Authorization Server
	
	docker run -d -p 8080:8080 marcindev99/spring-security-symetric-as:latest
Resource Server

	docker run -d -p 9090:9090 marcindev99/spring-security-symetric-rs:latest

