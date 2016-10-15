### Test microservice architecture

***bye-service :***
Spring boot application (A simple 'bye' microservice)
```shell
http://localhost:9002/bye
```

***hello-service :***
Spring boot application (A simple 'hello' microservice)
```shell
http://localhost:9001/hello
```

***sails-service :***
Node application (A simple node microservice)
```shell
http://localhost:1337/
```

***sidecar :***
Spring boot application (Link non-jvm application to our eureka service registry )
```shell
http://localhost:9006/
```

***eureka-service :***
Spring boot application (Microservice Registration and Discovery)
```shell
http://localhost:8761/
```

***gateway :***
Spring boot application (reverse proxy : entry point into the microservice ecosystem from the outside world)
```shell
http://localhost:9003/
http://localhost:9003/path1 : routing to 'hello-service'
http://localhost:9003/path2 : routing to 'bye-service'
http://localhost:9003/path3 : routing to 'sails-service'
```

![Img1](https://raw.githubusercontent.com/nbouherrou/microservice-architecture/master/images/img.png)
