package ru.job4j.cycles;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan * month > nik * month)  {
            ivan *= 3;
            nik *= 2;
        }
            return month;
        }
    }

