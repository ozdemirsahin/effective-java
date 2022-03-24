package com.example.memorymanagement.stack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackRestApi {

    @GetMapping("/stack")
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 1; i < 10000000; i++)
        {
            stack.push(i);
        }

        for (int i = 1; i < 10000000; i++)
        {
            //gc çalıştırdığında pop 'a göre daha fazla heap'te alan açılır.(bir önceki referans null'lanıyor )
            stack.pop();
        }

    }

}
