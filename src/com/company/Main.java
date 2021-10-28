package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher match = pat.matcher("abcdefghijklmnoasdfasdpqrstuv18340");
        Matcher match2 = pat.matcher("abcdefghijklmnopqrstuv18340");
        boolean result = match.matches();
        boolean result2 = match2.matches();
        System.out.println(result);
        System.out.println(result2);

        Pattern patMAC = Pattern.compile("((([a-z][A-Z]:){3})((\\d\\d:){2}\\d\\d))");
        Matcher matchMAC = patMAC.matcher("01:23:45:67:89:Az");
        Matcher matchMAC2 = patMAC.matcher("aE:dC:cA:56:76:54");
        boolean resultMAC = matchMAC.matches();
        boolean resultMAC2 = matchMAC2.matches();
        System.out.println(resultMAC);
        System.out.println(resultMAC2);

        Pattern patmoney = Pattern.compile("(((\\d\\d)(.\\d\\d))|(\\d\\d))( )((USD)|(RUB)|(EU))");
        Matcher matchmoney = patmoney.matcher("22 UDD");
        Matcher matchmoney2 = patmoney.matcher("23.78 USD");
        boolean resultmoney = matchmoney.matches();
        boolean resultmoney2 = matchmoney2.matches();
        System.out.println(resultmoney);
        System.out.println(resultmoney2);


    }
}
