package com.example.memorymanagement.passByValue.pirimitiveType;

public class Test {

    public static void main(String[] args) {
        String p1="Ahmet";
        int p2=3;

        Test t=new Test();

        System.out.println("----------main1----------");
        System.out.println(p1);
        System.out.println(p2);

        t.changeParam(p1,p2);

        System.out.println("----------main2----------");
        System.out.println(p1);
        System.out.println(p2);

    }

    public void changeParam(String p1, int p2){
        p1="Özdemir";
        p2=5;

        System.out.println("----------changeParam----------");
        System.out.println(p1);
        System.out.println(p2);
    }
}
