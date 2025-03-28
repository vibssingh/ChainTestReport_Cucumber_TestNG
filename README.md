# ChainTestReport_Cucumber_TestNG

**_Prerequisite_**

1. Java 17 is installed
2. Maven is installed
3. Eclipse or IntelliJ is installed

**_Dependency List:_**

1. Selenium – 4.28.1
2. Java 17
3. TestNG – 7.10.2
4. Cucumber – 7.18.1
5. Maven – 3.9.6
6. ChainTest Cucumber– 1.0.11

**_Implementation_**

1. Add ChainTest plugin to the runner class
````
@CucumberOptions(plugin = { 
  "com.aventstack.chaintest.plugins.ChainTestCucumberListener:"
})
````

2. Add chaintest.properties to src/test/resources directory
````
# chaintest configuration
chaintest.project.name= ChaninTest Report with Cucumber and TestNG
 
# generators:
## chainlp
chaintest.generator.chainlp.enabled=true
chaintest.generator.chainlp.class-name=com.aventstack.chaintest.generator.ChainLPGenerator
chaintest.generator.chainlp.host.url=http://localhost/
chaintest.generator.chainlp.client.request-timeout-s=30
chaintest.generator.chainlp.client.expect-continue=false
chaintest.generator.chainlp.client.max-retries=3
 
## simple
chaintest.generator.simple.enabled=true
chaintest.generator.simple.document-title=chaintest
chaintest.generator.simple.class-name=com.aventstack.chaintest.generator.ChainTestSimpleGenerator
chaintest.generator.simple.output-file=target/chaintest/Index.html
chaintest.generator.simple.offline=false
chaintest.generator.simple.dark-theme=true
chaintest.generator.simple.datetime-format=yyyy-MM-dd hh:mm:ss a
chaintest.generator.simple.js=
chaintest.generator.simple.css=
 
## email
chaintest.generator.email.enabled=true
chaintest.generator.email.class-name=com.aventstack.chaintest.generator.ChainTestEmailGenerator
chaintest.generator.email.output-file=target/chaintest/Email.html
chaintest.generator.email.datetime-format=yyyy-MM-dd hh:mm:ss a
````

3. To run the tests through command line, use the below command
````
mvn clean test
````

4. ChainTest Reports are generated in **_target folder – Index.html and email.html_**.

**_Index.html_**
![img.png](img.png)

**_Email.html_**
![img_1.png](img_1.png)
