package com.company;

class Benchmark {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 6000;
        long index = 0;
        while (true) {
            double x = 17 * 76;
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            index++;
        }
        System.out.println(index + " циклов за одну минуту.");
    }
}


