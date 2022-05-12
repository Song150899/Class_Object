package ClassHCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chieuDai;
        int chieuRong;
        int choice;

        System.out.println("Nhập chiều dài: ");
        chieuDai = input.nextInt();

        System.out.println("Nhập chiều rộng: ");
        chieuRong = input.nextInt();

        Hcn hinhChuNhat = new Hcn(chieuDai, chieuRong);

        do {
            System.out.println("====Menu====");
            System.out.println("1.Hiển thị chiều dài chiều rộng");
            System.out.println("2. Hiển thị Chu Vi Hình chữ nhật");
            System.out.println("3. Hiển thị Diện tích Hình chữ nhật");
            System.out.println("0. Thoát");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hình chữ nhật có " + hinhChuNhat.hienThi());
                    break;

                case 2:
                    System.out.println("Chu vi hình chữ nhật là: " + hinhChuNhat.getChuvi());
                    break;

                case 3:
                    System.out.println("Diện tích hình chữ nhật là: " + hinhChuNhat.getDienTich());
                    break;

                case 0:
                    System.exit(0);
            }

        } while (choice != 0);


    }
}



