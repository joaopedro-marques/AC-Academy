package com.joao.string;

public class FormatStrings {
    public static void main(String[] args) {
        float floatVar = 5.5f;
        int intVar = 6;
        String stringVar = "586";

        String fs;
        fs = String.format("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        " and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs);
    }

}
