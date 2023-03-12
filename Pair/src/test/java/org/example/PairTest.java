package org.example;

import org.junit.Assert;

public class PairTest {

    @org.junit.Test
    public void PairTest1() {
        Integer C = 0;
        String D = "Yess";
        Pair<Integer, String> P = new Pair<>(C, D);
        Assert.assertEquals(C, P.getKey());
        Assert.assertEquals(D, P.getValue());
    }

    @org.junit.Test
    public void PairTest2() {
        Integer C = 7;
        Integer D = 14;
        Pair<Integer, Integer> P = new Pair<>(C, D);
        Assert.assertEquals(C, P.getKey());
        Assert.assertEquals(D, P.getValue());
    }
    @org.junit.Test
    public void PairTest3() {
        Integer C = 0;
        Integer D = 1;
        Pair<Integer, Integer> P = new Pair<>(C, D);
        Assert.assertEquals(C, P.getKey());
        Assert.assertEquals(D, P.getValue());
    }
}