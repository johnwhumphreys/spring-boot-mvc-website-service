package site.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by John on 1/30/2016.
 * This is a basic site.controller designed to just serve up the main
 * demonstration web-page and show that SpringMVC is working.  It also
 * has one AJAX endpoint for serving a message to that page.
 */

@Controller
@RequestMapping("/")
public class HomeController {

    //Read the value from our application.properties file into this
    //variable using the @Value annotation.
    @Value(value="${custom.message}") private String message;

    //Serve up a basic home page - could be the basis for a single-page
    //application in a framework like AngularJS, or you can just use
    //multiple pages as you wish.
    public String index() {
        return "index";
    }

    //AJAX end-point for retrieving a custom message we will use
    //in our home-page as an example.
    @RequestMapping("message")
    @ResponseBody
    public String getMessage() {
        return message;
    }
}
