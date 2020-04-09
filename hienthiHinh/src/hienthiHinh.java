import java.util.Scanner;

public class hienthiHinh {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                String rec = "";
                for (int i = 0;i<3;i++) {
                    rec = "";
                    for (int j = 0;j<9;j++) {
                        rec = rec + "*";
                    }
                    System.out.println(rec);
                }
                break;
            case 2:
                String sqtri = "";
                for (int i=0;i<7;i++) {
                    sqtri = "";
                    for (int j=0;j<i;j++) {
                        sqtri = sqtri + "*";
                    }
                    System.out.println(sqtri);
                }
                break;
            case 3:
                String isotri = "";
                for (int i = 7;i>0;i--) {
                    isotri = "";
                    for (int j = 0;j<i;j++) {
                        isotri = isotri + "*";
                    }
                    System.out.println(isotri);
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
