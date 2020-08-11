package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qinglin.dql
 * @date 2020/6/14
 */
@RestController
public class EntryCtrl {

    @Value("${service.a.endpoint}")
    private String serviceAEndpoint;

    @Value("${service.b.endpoint}")
    private String serviceBEndpoint;

    private RestTemplate template = new RestTemplate();

    @RequestMapping("/")
    public Object index() {
        return Arrays.asList(getResp(serviceAEndpoint), getResp(serviceBEndpoint));
    }

    private String getResp(String endpoint) {
        return template.getForObject("http://" + endpoint, String.class);
    }

}
