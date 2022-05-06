package com.learnJava;

public class Test {

    public static void main(String[] args) {

        String original = new String("A" + "\u00ea" + "\u00f1" + "\u00fc" + "C");
        String downArrow = new String(" "+ "\u02c5");
        System.out.println(original);
        System.out.println(downArrow);

    }
}
