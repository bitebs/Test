package com.company;

public class Exercises {
    public static void main(Exercises[] args)
    {

        // Get the length of s.
        String s = null;
        int lengthString = getLengthString(s);
        //System.out.println(lengthString);
    }

    public static int getLengthString(String s){
        s = "example.com";
        int lengthString = s.length();
        return lengthString;
    }
}
