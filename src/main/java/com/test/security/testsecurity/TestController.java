package com.test.security.testsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gkaur on 29/06/2017.
 */
@RestController
public class TestController {

    @GetMapping("/healthcheck")
    @ResponseBody
    public String healthCheck()
    {
        System.out.println("Hi! I am up and running!!");
        return "HI! I AM UP AND RUNNING!";
    }
}
