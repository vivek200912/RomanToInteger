package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String romanNum = "MCMXCIV";
        int number = romanToInt(romanNum);
        System.out.println("Roman to Integer with my code is: " + number);
        int number1 = romanToIntOnlineSol(romanNum);
        System.out.println("Roman to Integer with Online Solution is: " + number1);
    }

    private static int romanToIntOnlineSol(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static int romanToInt(String strRoman) {
        int intNumber = 0;
        int num = 0;
        for(int i=strRoman.length()-1; i >=0; i--){
            switch(strRoman.charAt(i)){
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(4 * num < intNumber){
                intNumber = intNumber - num;
            } else {
                intNumber = intNumber + num;
            }
        }
        return intNumber;
    }
}