package com.example.mongotest.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Cacheable(value = "myProcess")
    public String process(){
        try {
            Thread.sleep(2000);
            System.out.println("I am not cached");
            return "Processed";
        } catch (InterruptedException e) {
            throw new RuntimeException("Oops");
        }
    }

}
