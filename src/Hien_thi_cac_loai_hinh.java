import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("menu");
            System.out.println("1 : Print the rectangle");
            System.out.println("2 : Print the square triangle");
            System.out.println("3 : Print isosceles triangle");
            System.out.println("0 : Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 7; i++) {
                        System.out.println("*******");
                    }
                    break;
                case 2:
                    String a = "";
                    for (int i = 1; i < 8; i++) {
                        a += "*";
                        System.out.println(a);
                    }
                    break;
                case 3:
                    for (int i = 0; i < 8; i++) {
                        String b = "";
                        for (int j = 1; j < 8-i ; j++) {
                            b += "*";
                        }
                        System.out.println(b);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;

            }
        }
    }
}
