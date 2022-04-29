package com.company;

public class Equals {
    public static void main(Equals[] args) {


        //System.out.println("Comparing "+str1+" and "+stringBuffer+": " + str1.contentEquals(stringBuffer));

        //System.out.println("Comparing "+str2+" and "+stringBuffer+": " + str2.contentEquals(stringBuffer));
    }

    public static boolean getStringEquals(String str){
        String str1 = "example.com", str2 = "Example.com";
        StringBuffer stringBuffer = new StringBuffer(str1);
        boolean stringEquals = false;
        return stringEquals;
    }

    public static boolean getStringEquals1(String str){
        String str1 = "example.com", str2 = "Example.com";
        StringBuffer stringBuffer = new StringBuffer(str1);
        boolean stringEquals = true;
        return stringEquals;
    }
}
