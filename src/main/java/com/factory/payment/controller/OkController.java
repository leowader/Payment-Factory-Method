package com.factory.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class OkController {

    @GetMapping
    public Map<String, String> ok() {
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Ok");
        return response;
    }
}
