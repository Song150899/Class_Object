package StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Start");
            System.out.println("2. End");
            System.out.println("3. Show");
            int so = input.nextInt();

            switch (so) {
                case 1:
                    stopWatch.start();
                    break;
                case 2:
                    stopWatch.stop();
                    break;
                default:
                    System.out.println(stopWatch.getElapsedTime());
            }

//        stopWatch.start();
////        for (int i = 0; i < 1000000000; i++) {
////            for (int j = 0; j < 100000000; j++) {
////
////            }
////        }
//        stopWatch.stop();
//
//        System.out.println(stopWatch.getElapsedTime());
        }
    }
}