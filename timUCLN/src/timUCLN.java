import java.util.Scanner;

public class timUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số thứ nhất: ");
        int a = scanner.nextInt();
        a = Math.abs(a);
        System.out.println("Mời nhập số thứ hai: ");
        int b = scanner.nextInt();
        b = Math.abs(b);
        if (a==0 || b==0) {
            System.out.println("a và b không có UCLN");
        }
        while (a != b) {
            if (a>b) {
                if (a%b==0) {
                    System.out.println("UCLN của a và b là: "+b);
                    break;
                } else {
                    System.out.println("a và b không có UCLN");
                    break;
                }
            } else {
                if (b%a==0) {
                    System.out.println("UCLN của a và b là: "+a);
                    break;
                } else {
                    System.out.println("a và b không có UCLN");
                    break;
                }
            }
        }
    }
}
