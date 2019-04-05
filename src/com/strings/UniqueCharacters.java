package com.strings;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        boolean uniqueFlag = true;
        for(int i = 0 ;i< s.length(); i++){
            for(int j = i+1 ; j< s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                {
                    uniqueFlag = false;
                    break;
                }
            }
            if(!uniqueFlag)
                break;
        }
        if(!uniqueFlag)
            System.out.println("String is not having unique characters");
        else
            System.out.println("String is having unique characters");

        System.out.println( System.currentTimeMillis() - start + "brute force");

        betterSolution(s);
    }



    private static void betterSolution(String input) {

        long start = System.currentTimeMillis();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), 1); // bool[i] = true;
        }
        if(map.size() == input.length()){
            System.out.println("String is having unique characters");
        }
        else
            System.out.println("String is not having unique characters");
        System.out.println( System.currentTimeMillis() - start + "better ");
    }


}
