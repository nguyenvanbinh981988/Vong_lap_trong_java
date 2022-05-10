import java.util.Scanner;

public class Tim_uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();

        if (a == b && b == 0) {
            System.out.println(a + " & " + b + " khong co UCLN");
        } else {
            int ucln = 0;
            if (a == 0 || b == 0) {
                if (a == 0) {
                    ucln = Math.abs(b);
                } else {
                    ucln = Math.abs(a);
                }
            } else if (a % b == 0 || b % a == 0) {
                if (a % b == 0) {
                    ucln = b;
                } else {
                    ucln = a;
                }
            } else {
                if (a > b) {
                    for (int i = 1; i < b; i++) {
                        if (a % i == 0 && b % i == 0) {
                            ucln = i;
                        }
                    }
                } else if (a < b) {
                    for (int i = 1; i < a; i++) {
                        if (a % i == 0 && b % i == 0) {
                            ucln = i;
                        }
                    }
                }
            }
            System.out.println(a + " & " + b + " co UCLH la: " + ucln);
        }
    }
}
