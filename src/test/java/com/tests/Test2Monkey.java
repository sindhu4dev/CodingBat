package com.tests;

import org.junit.Assert;
import org.junit.Test;

public class Test2Monkey {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }
    @Test
    public void test1(){
        Test2Monkey ts = new Test2Monkey();
        Assert.assertTrue(ts.monkeyTrouble(false,false));
    }
    @Test
    public void test2(){
        Test2Monkey ts = new Test2Monkey();
        Assert.assertTrue(!ts.monkeyTrouble(true,false));
    }
    @Test
    public void test3(){
        Test2Monkey ts = new Test2Monkey();
        Assert.assertTrue(!ts.monkeyTrouble(false,true));
    }

    @Test
    public void test4(){
        Test2Monkey ts = new Test2Monkey();
        Assert.assertTrue(ts.monkeyTrouble(true,true));
    }

}
