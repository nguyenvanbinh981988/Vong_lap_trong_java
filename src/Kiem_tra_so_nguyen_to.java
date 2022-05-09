import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can check");
        int a = scanner.nextInt();

        boolean check = true;

        if (a>2){
            for (int i= 2;i <= a/2;i++){
                if (a % i == 0){
                    check = false;
                }
            }
        } else if(a != 2){
            check = false;
        }

        if (check){
            System.out.println(a + " la so nguyen to");
        } else {
            System.out.println(a + " khong la so nguyen to");
        }
    }
}
