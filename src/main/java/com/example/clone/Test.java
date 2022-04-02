package com.example.clone;

import org.springframework.boot.Banner;
import org.springframework.util.StringUtils;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Shallow copy
        Model m1= new Model();
        Model m2=m1;

        System.out.println(m1==m2);

        // Deep Copy
        Model m3= new Model();
        m3.a=1;
        Model m4= new Model();
        m4.a=m3.a;

        System.out.println(m3==m4);

        //**************************************************************************
        //Deep Copy
        Model m5=new Model();
        m5.a=5;
        m5.b=5;
        Model m6=(Model)m5.clone();
        m6.a=3;
        m6.b=4;

        System.out.println(m5==m6);

    }
}
