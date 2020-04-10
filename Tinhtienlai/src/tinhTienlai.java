import java.util.Scanner;

public class tinhTienlai {
    public static void main(String[] args) {
        System.out.println("Mời nhập số tiền cho vay: ");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        System.out.println("Nhập số tháng cho vay: ");
        int month = scanner.nextInt();
        System.out.println("Nhập tỉ lệ lãi suất cho vay: ");
        float rate = scanner.nextFloat();
        double tienlai = money*rate/100/12*month;
        System.out.println("Tổng số tiền thu cả gốc lẫn lãi là: "+(money+tienlai));
    }
}
