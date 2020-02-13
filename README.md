# IMS-Project 

This project is an inventory management system using GCP to host an SQL database, which has CRUD functionality
built into classes and methods within Java Eclipse. This was uploaded to the GitHub remote repository. The methods 
were then tested using Mockito and JUnit. Automation was achieved through the use of the Jenkins CI-server to 
check for changes to the master branch on GitHub and pass that through to SonarQube, which tested the code for
bugs and other code smells. When the quality gates on SonarQube were achieved, a snapshot of the code is pushed to 
the Nexus remote repository. 

## Getting Started

### Prerequisites
Listed below is the software that is needed to achieve full functionality;
1. Java 1.8+
2. Maven
3. MySQL

### Installation
Java install.
Correctly install Java 1.8+ then add JAVA_HOME into the system PATH through altering of the environment variables of the system. 

-- %JAVA_HOME%/bin;--

Should be added into the System PATH.

Maven install.
Correctly download and install the lastest version of maven.
Add M2_home, which points towards the install location of maven, needs to be added into the system variables and the sytem PATH.

-- %M2_HOME%/bin;--

Should be added to the system PATH

Then it is required to install the IMS onto your machine to run.

-- mvn install--

This will install a jar file of the IMS into the .M2 file on your computerwhere it can be used from the command line.

## Running the tests

This repo includes Unit and intergration tests. This can be run using maven, see below on maven usage to run the desired tests.

Unit tests do not test when the method call's another method, when this is required intergration testing is used. Intergration testing using a 
plugin called mockito can 'Stub' connections to other methods and mock what they should return, allowing for full fuctionallity testing with known
values over multiple methods.
### Unit Tests
Unit tests are performed on methods that do not need to call another function, this is so that each method can be tested inderpendatly with out possible
issues being passed from another method.

In the command line navagate to the root of the project folder and run the following command, this will run all the unit tests in the project. Once run jococo 
would have produced test and stored them in the project folder. These reports with can be used to confirm that the set up is correct, it can be assumed to be 
working if all tests pass for unit functionallity.

--mvn test--

### Integration Tests
Unit tests do not test when the method call's another method, when this is required intergration testing is used. intergration testing using a pulgin called
mockito can 'Stub' connections to other methods and mock what they should return allowing for full fuctionallity testing with known values over multiple methods.

In the command line navagate to the root of the project folder and run the following command, this will run all the Intergration tests in the project. 
Once run jococo would have produced test and stored them in the project folder. These reports with can be used to confirm that the set up is correct, it can be
assumed to be working if all tests pass for intergration functionallity.

--mvn interaction-test--

### Coding style tests
Coding Style tests are used to ensure that the code produced is following best practices and not leaving the application open to known vunribilities. 
For this project a peice of software called sonarQube was used, once maven has been used to build the project succsesfully the the code can be checked
by sonarQube. In it's default set up it will check for;

* Coverage on New Code
* Duplicated Lines on New Code
* Maintainability Rating on New Code
* Reliability Rating on New Code
* Security Rating on New Code

Once analised it can provide feedback on the code and offer hints on how to correct it to compliant code.

See below for an example code smell;

-- Noncompliant Code Example
boolean foo(Object param) {
  if (expression) { // Noncompliant
    bar(param, true, "qix");
  } else {
    bar(param, false, "qix");
  }

  if (expression) {  // Noncompliant
    return true;
  } else {
    return false;
  }
}
Compliant Solution
boolean foo(Object param) {
  bar(param, expression, "qix");

  return expression;
} --

## Deployment
In an enterprise environment, there would be the ability to change local host to be the IP of whatever is needed on within the company's data.
## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
## Versioning
I used [SemVer](http://semver.org/) for versioning.
## Authors
* **Elliott Dorrington** - *IMS-Project* - [ElliottDorrington] (https://github.com/EDorrington98)
## License
This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 
## Acknowledgements
* Christopher Perrins, without whom this project would not have been able to be completed.
* Rhys Thompson, whose assistance was invaluable to the completion of this project.