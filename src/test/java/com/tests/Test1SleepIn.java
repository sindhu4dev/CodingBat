package com.tests;

import org.junit.Assert;
import org.junit.Test;

public class Test1SleepIn {

    //sleepIn(false, false) → true
    //sleepIn(true, false) → false
    //sleepIn(false, true) → true
    //sleepIn(true, true) → true
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    @Test
    public void test1(){
        Test1SleepIn ts = new Test1SleepIn();
        Assert.assertTrue(ts.sleepIn(false,false));
    }
    @Test
    public void test2(){
        Test1SleepIn ts = new Test1SleepIn();
        Assert.assertTrue(!ts.sleepIn(true,false));
    }
    @Test
    public void test3(){
        Test1SleepIn ts = new Test1SleepIn();
        Assert.assertTrue(ts.sleepIn(false,true));
    }

    @Test
    public void test4(){
        Test1SleepIn ts = new Test1SleepIn();
        Assert.assertTrue(ts.sleepIn(true,true));
    }

}
