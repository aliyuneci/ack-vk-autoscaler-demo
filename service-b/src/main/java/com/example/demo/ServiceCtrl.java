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
    public Object index(){
        long start = System.currentTimeMillis();

        byte[] arrayA = new byte[10000000];
        byte[] arrayB = new byte[10000000];
        byte[] arrayC = new byte[10000000];

        return String.valueOf(System.currentTimeMillis() - start);
    }

}
