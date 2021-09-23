package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldReturn1000() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldReturn1() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldReturn999() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldReturn0() {
        assertEquals(service.remain(1000), 0);
    }
}