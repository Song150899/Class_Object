package PtB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc 2 có công thức ax2+bx+c=0 ");

        Scanner input = new Scanner(System.in);
        PTB2 ptb2 = new PTB2();

        System.out.println("Nhập a");
        ptb2.a = input.nextInt();

        System.out.println("Nhập b");
        ptb2.b = input.nextInt();

        System.out.println(" Nhập c");
        ptb2.c = input.nextInt();

        if (ptb2.delta()<0){
            System.out.println("Phương trình vô nghiệm");

        } else if (ptb2.delta() == 0 ){
            System.out.println("Phương trình có nghiệm kép x1 = x2 = "+ ptb2.x());

        } else {
            System.out.println("Phương trình có 2 nghiệm: \n" + ptb2.getRoot1()+ "\n" + ptb2.getRoot2());
        }


    }
}
