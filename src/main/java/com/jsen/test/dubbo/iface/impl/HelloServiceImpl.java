package com.jsen.test.dubbo.iface.impl;

import com.jsen.test.dubbo.iface.HelloService;

public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello " + name;
    }
}
