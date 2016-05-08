package site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by John on 1/30/2016.
 * This is the main runner class for our executable JAR which
 * runs our website.
 */

//Will automatically be used as entry-point for the uber-jar/war when we start
//it up.  Also, will auto-detect the application.properties file and use it as
//spring boot applications look for an available file with that name by default.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Your website is running!");
    }
}
