package com.gupao.springbootdemo.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@Logger
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        System.out.println("hello ##eeeeeeeeee33333333##world.......");
        return "hello K8s <br/>111222 ";
    }
}
