package com.spring.bootapi.controller;

import com.spring.bootapi.model.PostMessage;
import com.spring.bootapi.model.SampleResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    private final SampleResponse sampleResponse;
    private final PostMessage pm;

    WebController(SampleResponse sampleResponse, PostMessage pm) {
        this.sampleResponse = sampleResponse;
        this.pm = pm;
    }

    @GetMapping("/response")
    public SampleResponse sampleResponse(@RequestParam String name) {
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setId(10);
        sampleResponse.setMessage("My name is " + name);
        return sampleResponse;
    }

    @PostMapping("/test")
    public PostMessage postMessage(@RequestBody PostMessage postMessage) {
        pm.setMessage(postMessage.getMessage());
        pm.setSubject(postMessage.getSubject());
        pm.setId(postMessage.getId());
        return pm;
    }
}
