CRM Testing POM Framework
This is a Front End testing project template built against Free CRM application
The CRM allows an user to create calendar, contacts, companies etc.
Tech Stack
The project has been built using Java, Maven, JUnit, Selenium WebDriver. Extent reports is used generate reports along with default TestNG ones.
Pre-requisites
•	Install Java and set path
•	Install Maven and set path
•	Install Eclipse IDE
•	Install Eclipse Plugins
o	Maven
•	Add all pre-requisite dependencies in POM
•	Ensure that Chrome is installed 
Setup
•	Clone repository or download zip.
•	Go to the project directory.
•	By default chrome browser is set up and fire fox option isn’t provided here
Writing the tests
•	New tests can be written in src/test/resources/features with appropriate tags.
Running the tests
•	Use testng.xml to run the project as TestNG suite
•	The test reports have been configured to be generate Extent report and emailable-report.html under test-output folder
Reporting
•	The basic testng HTML, Extent reports will be generated in the test-output folder 
Limitations
•	The testng.xml needs to be run manually now. However, once the CI/CD pipeline is implemented, this manual step execution is not be required and it will be integrated with the pipeline.
