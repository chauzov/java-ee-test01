package com.schauzov;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHello(String message) {
        System.out.println("Hello, " + message);
    }

} 