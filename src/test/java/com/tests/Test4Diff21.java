package com.tests;

public class Test4Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(26));
    }
    public static int diff21(int n) {
        int difference = 21 - n;
        int abs = Math.abs(difference);
        if(n>21){
            return 2*abs;
        }
        return abs;
    }
}
