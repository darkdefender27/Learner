=====================================================================
Microservice implementation using Spring Boot & Spring Data (MongoDB)
=====================================================================

Clone the remote repository into a local directory.

```sh
$ git clone https://github.com/darkdefender27/Learner Learner
$ cd Learner/
```


### Prerequisites

* Must have java8 installed
* docker-engine installed on the host machine
* On Mac/Windows refer: [Getting started with Docker on non-Linux machines] (https://docs.docker.com/machine/get-started/)


Running mongodb instance

```sh
$ docker run -P -d --name=mongodb mongo
```

Check if it's up & running and keep the forwarded port handy.

```sh
$ docker ps
```


Running the application

```sh
$ mvn clean install
$ java -Dspring.data.mongodb.uri=mongodb://192.168.99.100:32768/studentprofile -jar target/learner-service-0.0.1-SNAPSHOT.jar
````


### Contribution

* Never edit the master branch.
* Make a branch specific to the feature you wish to contribute on.
* Send me a pull request.


### License

GNU GPL Version 3, 29 June 2007.
Please refer this link [ http://www.gnu.org/licenses/gpl-3.0.txt ]
for detailed description.



**Free Software, Hell Yeah!**
