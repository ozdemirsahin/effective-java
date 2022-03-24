package com.example.memorymanagement.staticvariables;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class NonStaticRestApi {

    private static Random random = new Random();

    @GetMapping("/non-static")
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Double> list = new ArrayList<Double>(1000000);
        for (int i = 0; i < 1000000; i++)
        {
            list.add(random.nextDouble());
        }
    }
}