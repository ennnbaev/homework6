package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String input="2020/09/01 20:50";
        String email="ennnbaev@icloud.bjb";
        System.out.println(checkData(input));
       System.out.println(domen(email));
    }
    public static String checkData(String input){
String regex="[0-9][0-9][0-9][0-9]/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])\\s([0-1][0-9]|2[0-3]):[0-5][0-9]";
   if(input.matches(regex)){
       return "valid";
   }
   else {
       return "invalid";
   }

    }
    public static String domen(String email){
        String regex=".*@(.*\\..+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        if (matcher.find()){
            return matcher.group(1);
        }
        else {
            return "invalid";
        }
    }
}
