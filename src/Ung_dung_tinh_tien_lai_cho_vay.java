import java.util.Scanner;

public class Ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhap so tien vay");
        double soTienVay = scanner.nextFloat();

        System.out.println("Nhap so thang vay");
        int soThang = scanner.nextInt();

        System.out.println("ty gia lai");
        double tyGia = scanner.nextFloat();

        double tongTien = soTienVay;

        for (int i=1; i <= soThang;i++){
            tongTien += tongTien*(tyGia/(12*100));
        }

        System.out.println("Tong tien phai tra la: "+ tongTien);

    }
}
