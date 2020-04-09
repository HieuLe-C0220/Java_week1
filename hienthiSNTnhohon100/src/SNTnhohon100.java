import java.util.Scanner;

public class SNTnhohon100 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Nhập giá trị lớn nhất của dãy số nguyên tố cần in ra: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int N = 2;
        while (N<=num) {
            if (isPrime(N)) {
                System.out.println(N);
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
