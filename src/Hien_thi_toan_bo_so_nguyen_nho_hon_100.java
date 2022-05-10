public class Hien_thi_toan_bo_so_nguyen_nho_hon_100 {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(2);
        System.out.println(3);
        while (a<100){
            boolean check = true;
            for (int i = 3; i < a/2; i++) {
                if (a % i == 0){
                    check = false;
                }
            }

            if (check){
                System.out.println(a);
            }
            a++;

        }
    }
}
