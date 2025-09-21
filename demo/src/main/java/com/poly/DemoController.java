package com.poly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

@Controller
public class DemoController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ResponseEntity<String> request() {
        return ResponseEntity.ok("Hello Spring!");
    }
}
