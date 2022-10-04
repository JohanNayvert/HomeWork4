package com.skyeng;

public class Main {
    public static void main(String[] args){
        System.out.println("Cycles_1");
        System.out.println(" ");

        //task1
        task1_1();
        task1_2();
        task1_3();
        task1_4();

        //task2
        task2_1();
        task2_2();
        task2_3();

        //task3
        task3_1();
        task3_2();

        System.out.println("HoweWork_Completed");
    }

    //task3_1
    private static void task3_2() {
        System.out.println("Task_3-2");
        int depositVolume = 29_000;
        int depositTotal = 0;
        for (int i=1; i<=12; i++) {
            depositTotal = depositTotal + depositTotal/100;
            depositTotal = depositTotal + depositVolume;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, depositTotal);
        }
        System.out.println(" ");
    }

    //task3_1
    private static void task3_1() {
        System.out.println("Task_3-1");
        int depositVolume = 29_000;
        int depositTotal = 0;
        for (int i=1; i<=12; i++) {
            depositTotal = depositTotal + depositVolume;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, depositTotal);
        }
        System.out.println(" ");
    }

    //task2_3
    private static void task2_3() {
        System.out.println("Task_2-3");
        for (int i=1; i<=512; i*=2) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    //task2_2
    private static void task2_2() {
        System.out.println("Task_2-2");
        for (int i=7; i<=98; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    //task2_1
    private static void task2_1() {
        System.out.println("Task_2-1");
        for (int i=1904; i<=2096; i+=4) {
            System.out.println("Високосный год: " + i);
        }
        System.out.println(" ");
    }

    //task1_4
    private static void task1_4() {
        System.out.println("Task_1-4");
        for (int i=10; i>=-10; i--) {
            System.out.println("Число: " + i);
        }
        System.out.println(" ");
    }

    //task1_3
    private static void task1_3() {
        System.out.println("Task_1-3");
        for (int i=0; i<17; i = i+2) {
            System.out.println("Число: " + i);
        }
        System.out.println(" ");
    }

    //task1_2
    private static void task1_2() {
        System.out.println("Task_1-2");
        for (int i=10; i>0; i--) {
            System.out.println("Число: " + i);
        }
        System.out.println(" ");
    }

    //task1_1
    private static void task1_1() {
        System.out.println("Task_1-1");
        for (int i=1; i<=10; i++) {
            System.out.println("Число: " + i);
        }
        System.out.println(" ");
    }
}
