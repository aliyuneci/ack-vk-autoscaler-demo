package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinglin.dql
 * @date 2020/6/14
 */
@RestController
public class ServiceCtrl {

    @RequestMapping("/")
    public Object index() {
        long start = System.currentTimeMillis();

        double a = 11.635;
        for (int i = 0; i < 10000000; i++) {
            a = Math.sqrt(a);
        }
        return String.valueOf(System.currentTimeMillis() - start);
    }

}
