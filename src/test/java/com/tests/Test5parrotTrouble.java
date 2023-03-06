package com.tests;

public class Test5parrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9));
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred2(110));
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
    if(talking && (hour<7 || hour>20)) {
        return true;
    }
    return false;
    }
    public static boolean makes10(int a, int b) {
        int sum = a+b;
    if((a ==10 || b == 10) || sum ==10){
        return true;
    }
    return false;
    }
    public static boolean nearHundred(int n) {

        if((n>89 && n<101) || (n>189 && n<201)) {
            return true;
        }
        return false;

    }
    public static boolean nearHundred2(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
    public static boolean posNeg(int a, int b, boolean negative) {
    if((a<0 && b>0) || (a>0 && b<0) && !negative){
        return true;
    }
    if(negative && (a<0 && b<0)) {
        return true;
    }
    return false;
    }
}
