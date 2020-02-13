#IMS-Project 

This project is an inventory management system using GCP to host an SQL database, which has CRUD functionality
built into classes and methods within Java Eclipse. This was uploaded to the GitHub remote repository. The methods 
were then tested using Mockito and JUnit. Automation was achieved through the use of the Jenkins CI-server to 
check for changes to the master branch on GitHub and pass that through to SonarQube, which tested the code for
bugs and other code smells. When the quality gates on SonarQube were achieved, a snapshot of the code is pushed to 
the Nexus remote repository. 

##Getting Started

###Prerequisites
1. Java 1.8*
2. Maven
3. MySQL

###Installation
To get the class files to work mvn - install
To get methods to the runtime environment mvn - java.jar name

##Running the tests
###Unit Tests
mvn test
###Integration Tests
mvn 
###Coding style tests

##Deployment
change local host to be the IP of anyth 
##Built With
* [Maven](https://maven.apache.org/) - Dependency Management
##Versioning
I used [SemVer](http://semver.org/) for versioning.
##Authors
* **Elliott Dorrington** - *IMS-Project* - [ElliottDorrington] (https://github.com/EDorrington98)
##License
This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 
##Acknowledgements
* Christopher Perrins, without whom this project would not have been able to be completed.
* Rhys Thompson, whose assistance was invaluable to the completion of this project.