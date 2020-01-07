# CRM Testing Framework
This is a Front End testing project template built against Free CRM application

The CRM allows an user to create calendar, contacts, companies etc.

## **Tech Stack**
The project has been built using Java, Maven, JUnit, Selenium WebDriver. Extent reports is used generate reports along with default TestNG ones. 

## **Pre-requisites**
* Install Java and set path
* Install Maven and set path
* Install Eclipse IDE
* Install Eclipse Plugins
  - Maven
* Ensure that Chrome is installed and the chromedriver that matches the Chrome version in your $PATH is downloaded and available in lib/drivers 

## **Setup**
* Clone repository or download zip.
* Go to the project directory.
* Set the Browser to Chrome 
  
## **Running the tests**
* Use "mvn test" or "mvn clean install" to run the tests from the command line. These will be used for CI/CD pipeline implementation.
* Use testng.xml to run the project as TestNG suite
* The test reports have been configured to be generate Extent report and emailable-report.html under test-output folder

## **Reporting**
* The basic testng HTML, Extent reports will be generated in the test-output folder.


## **Limitations**
* The testng.xml needs to be run manually now. However, once the CI/CD pipeline is implemented, this manual step execution is not  required and it will be integrated with the pipeline.
