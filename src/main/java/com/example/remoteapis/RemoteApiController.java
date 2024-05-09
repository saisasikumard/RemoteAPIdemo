package com.example.remoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApiController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public Object getRandomPersonDetails(){
        String url="https://www.boredapi.com/api/activity";
        Object responseObject=restTemplate.getForObject(url, Object.class);
        return responseObject;
    }

    @GetMapping("/custome-get")
    public Object getCustomRandomPersonDetails(){
        String url="https://www.boredapi.com/api/activity";
        Object responseObject=restTemplate.getForObject(url, RandomActivity.class);
        return responseObject;
    }

    @GetMapping("/football")
    public String getRandomFootball(){
        String url="http://localhost:9999/Football/Ronaldo";
        String responseObject=restTemplate.getForObject(url, String.class);
        return responseObject;
    }







}
