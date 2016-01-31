# spring-boot-mvc-website-service
This is an example of how to use Spring Boot Actuator to create a spring-mvc website that runs as a linux service out of an uber-jar.

The uber-jar actually has the init.d management script embedded into the front of it which means you don't need anything to install your service besides the JAR itself!  No web-server or external configuration is required at all unless you desire to make things configurable per environment with external properties files.

<b style="color: #336699;">This example does the following:</b>
<ul>
    <li>Sets up the Maven POM file:
        <ul>
            <li>Imports the spring-boot "spring-boot-starter-parent" parent pom.</li>
            <li>Imports the "spring-boot-starter-web" dependency to make the spring web-libraries available.</li>
            <li>Imports the "spring-boot-maven-plugin" build plugin to help us test our application through maven and to build our final executable JAR with the embedded init.d service management script.</li>
            <li>
        </ul>
    </li>
    <li>Creates an Application.java class annotated with @SpringBootApplication containing the main() method we need to start our application.  This annotation implicitly provides the following set of annotations:
        <ul>
            <li>```java@Configuration```</li>
            <li>```java@EnableAutoConfiguration```</li>
            <li>```java@ComponentScan```</li>
        </ul>
    </li>
    <li>This will also implicitly have the application look for an "application.properties" file on the class-path (or other places if we do some extra work).  So we have added such a file to the [src/main/resources] directory.  We have used it to set up the server port, the management port, and a single property we will use in our controller just as an example of how to pass a message.
    </li>
    <li>Finally, we added a controller that serves a default index.html page when you go to the root URL our site is hosted at (localhost:9001 as defined in our "application.properties" file).  This controller also loads one property (custom.message) from our properties file and serves it from an AJAX endpoint so that it can be used in our index.html page (and others if desired).
    </li>
</ul>
