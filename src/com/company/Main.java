package com.company;

import java.util.ArrayList;
import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int n = 10000;            // number
        int countThreads = 4;    // threads
        String fileName = "Result.txt";

        ArrayList<double[]>arrayList=new ArrayList<>(countThreads);
        switch (countThreads)
        {
            case 1:
            {
                double start=System.currentTimeMillis();
                Factorial factorial = new Factorial(n);
                factorial.calculationFactorial();
                factorial.print();
                double finish=System.currentTimeMillis();
                factorial.save(fileName,finish-start);
                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
            case 2:
            {
                Phaser phaser=new Phaser(1);
                double start=System.currentTimeMillis();

                CalculationFactorial []threads = new CalculationFactorial[2];
                for (int i = 0; i < threads.length; i++)
                    threads[i] = new CalculationFactorial(n, i+1, countThreads,phaser,arrayList,fileName);

                for (int i = 0; i < threads.length; i++)
                    threads[i].start();

                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndDeregister();

                for (int i = 0; i < threads.length; i++)
                    threads[i].join();

                double finish=System.currentTimeMillis();

                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
            case 4:
            {
                Phaser phaser=new Phaser(1);
                double start=System.currentTimeMillis();

                CalculationFactorial []threads = new CalculationFactorial[4];
                for (int i = 0; i < threads.length; i++)
                    threads[i] = new CalculationFactorial(n, i+1, countThreads,phaser,arrayList,fileName);

                for (int i = 0; i < threads.length; i++)
                    threads[i].start();

                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndDeregister();

                for (int i = 0; i < threads.length; i++)
                    threads[i].join();

                double finish=System.currentTimeMillis();
                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
            case 8:
            {
                Phaser phaser=new Phaser(1);
                double start=System.currentTimeMillis();

                CalculationFactorial []threads = new CalculationFactorial[8];
                for (int i = 0; i < threads.length; i++)
                    threads[i] = new CalculationFactorial(n, i+1, countThreads,phaser,arrayList,fileName);

                for (int i = 0; i < threads.length; i++)
                    threads[i].start();

                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndDeregister();

                for (int i = 0; i < threads.length; i++)
                    threads[i].join();

                double finish=System.currentTimeMillis();
                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
            case 16:
            {
                Phaser phaser=new Phaser(1);
                double start=System.currentTimeMillis();

                CalculationFactorial []threads = new CalculationFactorial[16];
                for (int i = 0; i < threads.length; i++)
                    threads[i] = new CalculationFactorial(n, i+1, countThreads,phaser,arrayList,fileName);

                for (int i = 0; i < threads.length; i++)
                    threads[i].start();

                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndDeregister();

                for (int i = 0; i < threads.length; i++)
                    threads[i].join();

                double finish=System.currentTimeMillis();
                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
            case 32:
            {
                Phaser phaser=new Phaser(1);
                double start=System.currentTimeMillis();

                CalculationFactorial []threads = new CalculationFactorial[32];
                for (int i = 0; i < threads.length; i++)
                    threads[i] = new CalculationFactorial(n, i+1, countThreads,phaser,arrayList,fileName);

                for (int i = 0; i < threads.length; i++)
                    threads[i].start();

                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndDeregister();

                for (int i = 0; i < threads.length; i++)
                    threads[i].join();


                double finish=System.currentTimeMillis();
                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
            case 64:
            {
                Phaser phaser=new Phaser(1);
                double start=System.currentTimeMillis();

                CalculationFactorial []threads = new CalculationFactorial[64];
                for (int i = 0; i < threads.length; i++)
                    threads[i] = new CalculationFactorial(n, i+1, countThreads,phaser,arrayList,fileName);

                for (int i = 0; i < threads.length; i++)
                    threads[i].start();

                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndAwaitAdvance();
                phaser.arriveAndDeregister();

                for (int i = 0; i < threads.length; i++)
                    threads[i].join();


                double finish=System.currentTimeMillis();
                System.out.println("Time(s) : "+(finish-start)/1000);
                break;
            }
        }

    }
}
