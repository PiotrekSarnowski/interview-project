package com.example.interviewproject.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class WatchService {

    public String hello() {
        return "Hello world";
    }
}
