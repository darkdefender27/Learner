===========================================
Implementation of Microservice architecture
===========================================

### Docker Image

Download the docker image from here: [darkdefender27/learner-service](docker.io/darkdefender27/learner-service)

### Empezar

Clone the remote repository into a local directory.

```sh
$ git clone https://github.com/darkdefender27/Learner Learner
$ cd Learner/
```


### Prerequisites

* Must have java8 installed
* docker-engine installed on the host machine
* On Mac/Windows refer: [Getting started with Docker on non-Linux machines] (https://docs.docker.com/machine/get-started/)


### Execution (using docker-compose)

```sh
$ docker-compose up
```


### ~~Execution~~

Build a docker image for the application

```sh
$ pwd
~/.../Learner

$ docker build -t microservice/learner-service .
Successfully built 499361c96a65
```

Running the application container

```sh
$ docker images

REPOSITORY                         TAG                 IMAGE ID            CREATED             SIZE
microservice/learner-service   latest              499361c96a65        6 minutes ago       678.5 MB

$ docker run -P -d --name learner-service --link mongodb microservice/learner-service
$ docker ps

CONTAINER ID        IMAGE                              COMMAND                  CREATED             STATUS              PORTS                      NAMES
71519d8ab576        microservice/learner-service   "java -Dspring.data.m"   4 seconds ago       Up 3 seconds        0.0.0.0:32769->8080/tcp    learner-service

```


### Like It?
You can say [thanks](https://saythanks.io/to/darkdefender27)!


### Contribution

* Never edit the master branch.
* Make a branch specific to the feature you wish to contribute on.
* Send me a pull request.


### License

GNU GPL Version 3, 29 June 2007.
Please refer this link [GNU GPL 3.0 License] (http://www.gnu.org/licenses/gpl-3.0.txt) for detailed description.


**Free Software, Hell Yeah!** :facepunch:
