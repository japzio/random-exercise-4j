package com.japzio.string;

import java.util.StringJoiner;

public class StringJoinerApp {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(" ");

        stringJoiner.add("jasper");
        stringJoiner.add("ebeth");
        stringJoiner.add("jappeth");

        System.out.println(stringJoiner);

    }
}
