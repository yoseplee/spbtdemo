package aiia.yosep.spbtdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping(value = "/")
    public String home() {
        return "RestfulTest";
    }

    @GetMapping(value = "/index.html")
    public String index() {
        return "index";
    }
}
