package ru.podlubnyy.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-alex")
    public String sayHello() {
        return "hello_alex";

    }
}
