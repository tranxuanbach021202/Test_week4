package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChargingTest {
    Charging test = new Charging();

    @Test
    public void test1() {
        assertEquals(test.checkCharging(-3), "Input khong hop le");
    }
    @Test
    public void test2() {
        assertEquals(test.checkCharging(20), "Sac nhanh");
    }

    @Test
    public void test3() {
        assertEquals(test.checkCharging(70), "Sac thuong");
    }

    @Test
    public void test4() {
        assertEquals(test.checkCharging(100), "Tu dong ngat sac");
    }

    @Test
    public void test5() {
        assertEquals(test.checkCharging(120), "Input khong hop le");
    }


}
