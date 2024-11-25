package com.example.javaTypeTest;



public class JavaTypePerformanceAnalysis {

    public static void main(String[] args) {
        long startTime, endTime;

        //1) Primitive Type 사용시 실행시간 측정 - add 100_000_000
        startTime = System.nanoTime();
        int sumPrimitive = 0;
        for (int num = 0; num < 100_000_000; num++) {
            sumPrimitive += num;
        }
        endTime = System.nanoTime();
        System.out.println("Primitive Type Example 실행 시간: " + ((endTime - startTime) / 1_000_000_000.0) + "s");

        //2) Wrapper Class 사용시 실행시간 측정 - add 100_000_000
        startTime = System.nanoTime();
        Integer sumWrapper = 0;       //Auto-Boxing 발생
        for (int num = 0; num < 100_000_000; num++) {
            sumWrapper += num; // Auto-Unboxing 및 Auto-Boxing 발생
        }
        endTime = System.nanoTime();
        System.out.println("Wrapper Class Example 수행 시간: " + ((endTime - startTime) / 1_000_000_000.0) + "s");

    }
}
