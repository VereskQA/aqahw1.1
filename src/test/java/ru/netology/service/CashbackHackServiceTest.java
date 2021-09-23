package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldReturn100() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldReturn1() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldReturn999() {
        assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn0() {
        assertEquals(0, service.remain(1000));
    }

}