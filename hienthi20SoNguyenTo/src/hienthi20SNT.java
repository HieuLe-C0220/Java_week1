import java.util.Scanner;

public class hienthi20SNT {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int count = 0;
        int N = 2;
        while (count<num) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        if( n == 2)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } return true;
    }
}
