public class Hien_thi_toan_bo_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        int count = 2;
        int a = 4;

        System.out.println(2);
        System.out.println(3);
        while (count<20){
            boolean check = true;
            for (int i = 3; i < a/2; i++) {
                if (a % i == 0){
                    check = false;
                }
            }

            if (check){
                System.out.println(a);
                count++;
            }
            a++;

        }
    }
}
