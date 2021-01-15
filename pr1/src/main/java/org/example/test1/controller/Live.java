package org.example.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Live {

    @GetMapping("/alive")
    public void getTest() {

    }
}
