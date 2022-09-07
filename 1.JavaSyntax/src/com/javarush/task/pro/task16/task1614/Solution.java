package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant a = Instant.MAX;

        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        Instant a = Instant.MAX;
        long secs = a.getEpochSecond();

        return Instant.ofEpochSecond(secs);
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant a = Instant.MAX;
        long secs = a.getEpochSecond();
        int nano = a.getNano();

        return Instant.ofEpochSecond(secs, nano);
    }
}
